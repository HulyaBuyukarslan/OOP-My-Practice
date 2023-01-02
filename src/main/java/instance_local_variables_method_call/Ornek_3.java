package instance_local_variables_method_call;

public class Ornek_3 {
    public static void main(String[] args) {

        updateWord("john", "black");


    }


    public static void updateWord(String s, String t) {
        s = s.substring(0, 1).toUpperCase() + t.substring(2);
        System.out.println(s);


    }



}
