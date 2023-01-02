package instance_local_variables_method_call;

public class Ornek_1 {

    public static void main(String[] args) {

        multiply (3,5);
        multiply(5);
        multiply(2.5,2.5);
//        multiply(2.5);


    }

 public static void multiply(int num1, int num2) {
        System.out.println(num1* num2);
    }
    public static void multiply(int num1) {
        System.out.println(num1*num1);
    }
    public static void multiply(double num1, double num2) {
        System.out.println(num1* num2);
    }

}
