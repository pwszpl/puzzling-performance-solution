package com.kodewerk.profile;

import java.util.*;
import java.io.*;

public class CheckIntegerTestHarness {
    public static void main(String[] args) throws IOException {
//        System.out.println("0".codePointAt(0));
//        System.out.println("1".codePointAt(0));
//        System.out.println("2".codePointAt(0));
//        System.out.println("3".codePointAt(0));
//        System.out.println("4".codePointAt(0));
//        System.out.println("5".codePointAt(0));
//        System.out.println("6".codePointAt(0));
//        System.out.println("7".codePointAt(0));
//        System.out.println("8".codePointAt(0));
//        System.out.println("9".codePointAt(0));
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
                boolean isInt = Solutions.checkInteger(testItem);
                accumulatedTime += System.currentTimeMillis() - starttime;
                if (isInt)
                    truecount++;
            }
            System.out.println(truecount + " (count); time " + accumulatedTime);
        }
    }

}