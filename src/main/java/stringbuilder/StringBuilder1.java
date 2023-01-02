package stringbuilder;

public class StringBuilder1 {


    public static void main(String[] args) {


//
//        StringBuilder sb= new StringBuilder(9);
//
//        System.out.println(sb.length() + " - " + sb.capacity());

//        Output 0 - 9


//        StringBuilder sb= new StringBuilder();
//        System.out.println(sb.length() + " - " + sb.capacity());

//        Output 0 - 16



//        StringBuilder sb= new StringBuilder("Java");
//        System.out.println(sb.length() + " - " + sb.capacity());

//        Output 4 - 20



        StringBuilder sb= new StringBuilder("StringBuilder");
       System.out.println(sb.delete(3, 6).toString() + " - " + sb.length());

//        Output StrBuilder - 10



    }



}
