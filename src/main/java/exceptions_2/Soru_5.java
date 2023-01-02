package exceptions_2;

public class Soru_5 {

//    public static void main(String[] args) {
//
//        Integer z = 0;
//        try {
//            String s = "1234";
//            z = Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            System.out.println(e);
//        }
//        System.out.println(z);
//    }


        // Output 1234




//    public static void main(String[] args) {
//
//        Integer z = 0;
//        try {
//            String s = "abcd";
//            z = Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            System.out.println("Good");
//        }
//        System.out.println(z);
//    }

//        Output
//        Good
//        0


//    public static void main(String[] args) {
//
//        Integer z = 0;
//        try {
//            String s = "abcd";
//            z = Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            System.out.println("Good");
//        }
//        System.out.println(z);
//    }


//        Run Time Exception verir




    public static void main(String[] args) {

        String s = "abcd";
        try {
            Object obj = new Integer (12);
            s = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Good");
        }
        System.out.println(s);
    }

//           Output abcd




}