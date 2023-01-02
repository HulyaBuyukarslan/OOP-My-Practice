package encapsulation;

public class Test1_Runner {
    public static void main(String[] args) {
       Test1 obj = new Test1();

       System.out.println(obj.isDisabled());
        obj.setDisabled(true);
        System.out.println(obj.isDisabled());
        System.out.println(obj.getAge());
//        obj.setAge();
        System.out.println(obj.getGender());


    }



















}
