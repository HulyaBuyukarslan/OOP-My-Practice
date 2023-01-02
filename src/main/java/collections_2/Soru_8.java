package collections_2;

import java.util.HashSet;

public class Soru_8 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("A");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
    }
}

