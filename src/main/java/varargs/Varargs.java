package varargs;

public class Varargs {

    static void m2(String str, int... a) {
        System.out.println(str);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

//        m2("Java", 101, 102);
//        m2(100, 101, 102);
//        m2(101, 102);
//        m2(100, 101, "102");

    }















}
