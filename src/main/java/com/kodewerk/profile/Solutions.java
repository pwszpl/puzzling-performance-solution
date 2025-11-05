package com.kodewerk.profile;

public class Solutions {

    //10000000 (count); time 1581
    //10000000 (count); time 1246
    //5000000 (count); time 1290
    //5000000 (count); time 1234
    //3000000 (count); time 12230
    //3000000 (count); time 13582
//    public static boolean checkInteger(String testInteger) {
//        try {
//            Integer theInteger = new Integer(testInteger);//fails if not  a number
//            return
//                    (theInteger.toString() != "") && //not empty
//                            (theInteger.intValue() > 10) && //greater than ten
//                            ((theInteger.intValue() >= 2) &&
//                                    (theInteger.intValue() <= 100000)) && //2>=X<=100000
//                            (theInteger.toString().charAt(0) == '3'); //first digit is 3
//        } catch (NumberFormatException err) {
//            return false;
//        }
//    }

    //10000000 (count); time 208
    //10000000 (count); time 185
    //5000000 (count); time 132
    //5000000 (count); time 174
    //3000000 (count); time 103
    //3000000 (count); time 103
//    public static boolean checkInteger(String testInteger) {
//        int intLen = testInteger.length();
//        switch(intLen){
//            case(5):
//            case(4):
//            case(3):
//            case(2):
////                char firstChar = testInteger.charAt(0);
////                if(firstChar != '3') return false;
//                int firstChar = testInteger.codePointAt(0);
//                if(firstChar != 51) return false;
//
//
//                for(int i=1;i<intLen;i++){
//                    int nchar = testInteger.codePointAt(i);
//                    if(nchar<48 || nchar>57) return false;
//                }
////                if(testInteger.chars().anyMatch(e -> !(e>=48 && e<=57))) return false;
//                return true;
//            default:
//                return false;
//        }
//    }

//       10000000 (count); time 177
//       10000000 (count); time 194
//       5000000 (count); time 82
//       5000000 (count); time 94
//       3000000 (count); time 144
//       3000000 (count); time 80
//    public static boolean checkInteger(String testInteger) {
//        int intLen = testInteger.length();
//        int firstChar = testInteger.codePointAt(0);
//        if(firstChar != 51) return false;
//        switch(intLen){
//            case(5):
//                if(testInteger.codePointAt(4)<48 || testInteger.codePointAt(4)>57) return false;
//            case(4):
//                if(testInteger.codePointAt(3)<48 || testInteger.codePointAt(3)>57) return false;
//            case(3):
//                if(testInteger.codePointAt(2)<48 || testInteger.codePointAt(2)>57) return false;
//            case(2):
//                if(testInteger.codePointAt(1)<48 || testInteger.codePointAt(1)>57) return false;
//                break;
//            default:
//                return false;
//        }
//        return true;
//    }

    //10000000 (count); time 108
    //10000000 (count); time 103
    //5000000 (count); time 72
    //5000000 (count); time 92
    //3000000 (count); time 78
    //3000000 (count); time 90
    public static boolean checkInteger(String testInteger) {
        int intLen = testInteger.length();
        int firstChar = testInteger.codePointAt(0);
        if(firstChar != 51) return false;
        switch(intLen){
            case(5):
                if(notValidCodePoint(testInteger.codePointAt(4))) return false;
            case(4):
                if(notValidCodePoint(testInteger.codePointAt(3))) return false;
            case(3):
                if(notValidCodePoint(testInteger.codePointAt(2))) return false;
            case(2):
                if(notValidCodePoint(testInteger.codePointAt(1))) return false;
                break;
            default:
                return false;
        }
        return true;
    }

    public static boolean notValidCodePoint(int codePoint){
        switch(codePoint){
            case(48):
            case(49):
            case(50):
            case(51):
            case(52):
            case(53):
            case(54):
            case(55):
            case(56):
            case(57):
                return false;
            default:
                return true;
        }
    }

    //10000000 (count); time 124
    //10000000 (count); time 137
    //5000000 (count); time 102
    //5000000 (count); time 134
    //3000000 (count); time 109
    //3000000 (count); time 118
//    public static boolean checkInteger(String testInteger) {
//        int intLen = testInteger.length();
//        int firstChar = testInteger.codePointAt(0);
//        if(firstChar != 51) return false;
//        switch(intLen){
//            case(5):
//                switch(notValidCodePoint(testInteger.codePointAt(4))){
//                    case(1):
//                        return false;
//                }
//            case(4):
//                switch(notValidCodePoint(testInteger.codePointAt(3))){
//                    case(1):
//                        return false;
//                }
//            case(3):
//                switch(notValidCodePoint(testInteger.codePointAt(2))){
//                    case(1):
//                        return false;
//                }
//            case(2):
//                switch(notValidCodePoint(testInteger.codePointAt(1))){
//                    case(1):
//                        return false;
//                }
//                break;
//            default:
//                return false;
//        }
//        return true;
//    }
//
//    public static short notValidCodePoint(int codePoint){
//        switch(codePoint){
//            case(48):
//            case(49):
//            case(50):
//            case(51):
//            case(52):
//            case(53):
//            case(54):
//            case(55):
//            case(56):
//            case(57):
//                return 0;
//            default:
//                return 1;
//        }
//    }
    //10000000 (count); time 293
    //10000000 (count); time 337
    //5000000 (count); time 169
    //5000000 (count); time 157
    //3000000 (count); time 244
    //3000000 (count); time 171
//    public static boolean checkInteger(String testInteger) {
//        // not checking for null, just throw the exception
//        if ( testInteger.charAt(0) != '3') return false;
//        switch(testInteger.length()) {
//            case 5:
//                if ( ! Character.isDigit(testInteger.charAt(4))) return false;
//            case 4:
//                if ( ! Character.isDigit(testInteger.charAt(3))) return false;
//            case 3:
//                if ( ! Character.isDigit(testInteger.charAt(2))) return false;
//            case 2:
//                if ( ! Character.isDigit(testInteger.charAt(1))) return false;
//                break;
//            default:
//                return false;
//        }
//        return true;
//    }
}
