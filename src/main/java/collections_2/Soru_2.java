package collections_2;

import java.util.TreeSet;

public class Soru_2 {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("C");
        tSet.add("B");
        tSet.add("C");
        tSet.add("A");
        for (String w : tSet){
            System.out.print(w + " ");
        }
    }
}
