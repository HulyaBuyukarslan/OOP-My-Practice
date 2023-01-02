package constructors;

public class Order {
    String value = "a";

    Order() {
        value = value + "b";
    }
    Order(String c) {
        value = value + c;
    }
    public static void main(String[] args) {

//        Order order = new Order("f");
//        System.out.println(order.value);


//        Order order = new Order();
//        System.out.println(order.value);


        Order order1 = new Order("r");
        Order order2 = new Order();
        System.out.println(order1.value + order2.value);






    }














}
