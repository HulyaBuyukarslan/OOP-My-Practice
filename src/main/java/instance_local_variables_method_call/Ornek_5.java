package instance_local_variables_method_call;

public class Ornek_5 {
    public static void main(String[] args) {

        add(3.2, 4.8); //Output A
        add(5, 7.3); //Output B
        add(5, 7); //Output C
        add(5.3, 7); //Output D


    }

    public static void add(double n1, double n2) {
        System.out.println(n1 + n2);
    }
    public static void add(int n1, double n2) {
        System.out.println(n1 + n2);
    }
    public static void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

}
