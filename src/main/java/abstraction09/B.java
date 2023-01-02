package abstraction09;

    abstract class B extends A{
        @Override
        void firstMethod(){
            System.out.println("FIRST");
        }
        abstract void thirdMethod();
    }

