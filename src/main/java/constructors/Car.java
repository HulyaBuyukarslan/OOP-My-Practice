package constructors;

public class Car {

    int price = 50;
    public Car(int price) {
        this.price = price;
    }


    public static void main(String[] args) {

        Car c1 = new Car(50);
        System.out.println(c1.price);


//        Car c1 = new Car();
//        System.out.println(c1.price);


//        Car c1 = new Car(50);
//        System.out.println(c1);



//         Car c1 = new Car();
//         System.out.println(c1);


    }




}
