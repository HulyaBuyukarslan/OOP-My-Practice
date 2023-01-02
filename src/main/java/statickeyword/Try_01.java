package statickeyword;

public class Try_01 {
    static int a = 10;

    public static void main(String[] args) {
        Try_01 t1 = new Try_01();
        Try_01 t2 = new Try_01();
        t1.a = a + 2;
        t2.a = a + 3;
        System.out.println(t1.a);
        System.out.println(t2.a);
    }



}
