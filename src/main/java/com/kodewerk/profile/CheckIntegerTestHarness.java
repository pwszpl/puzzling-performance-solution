package com.kodewerk.profile;

import java.util.*;
import java.io.*;

public class CheckIntegerTestHarness {
    public static void main(String[] args) throws IOException {
        testDataset("dataset1.dat");
        testDataset("dataset2.dat");
        testDataset("dataset3.dat");
    }

    public static void testDataset(String dataset) throws IOException {
        ArrayList<String> testItems = new ArrayList<>();
        DataInputStream rdr = new DataInputStream(new BufferedInputStream(new FileInputStream(dataset)));

        String s;
        try {
            while ((s = rdr.readUTF()) != null)
                testItems.add(s);
        } catch (EOFException e) {
        }
        rdr.close();

        for(int i=0;i<2;i++){
            int truecount = 0;
            long accumulatedTime = 0L;
            for (String testItem : testItems){
                long starttime = System.currentTimeMillis();
                boolean isInt = checkInteger(testItem);
                accumulatedTime += System.currentTimeMillis() - starttime;
                if (isInt)
                    truecount++;
            }
            System.out.println(truecount + " (count); time " + accumulatedTime);
        }
    }

    public static boolean checkInteger(String testInteger) {
        try {
            Integer theInteger = new Integer(testInteger);//fails if not  a number
            return
                    (theInteger.toString() != "") && //not empty
                            (theInteger.intValue() > 10) && //greater than ten
                            ((theInteger.intValue() >= 2) &&
                                    (theInteger.intValue() <= 100000)) && //2>=X<=100000
                            (theInteger.toString().charAt(0) == '3'); //first digit is 3
        } catch (NumberFormatException err) {
            return false;
        }
    }
}