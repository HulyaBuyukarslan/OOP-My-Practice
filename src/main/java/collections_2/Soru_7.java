package collections_2;

import java.util.HashSet;
import java.util.TreeSet;

public class Soru_7 {
    public static void main(String[] args) {

    HashSet<String> hSet = new HashSet<>();
    hSet.add("Z");
    hSet.add("Y");
    hSet.add("X");
    hSet.add("X");
    System.out.println(hSet);//A
    TreeSet<String> tSet = new TreeSet<>(hSet);
    System.out.println(tSet);//B
}
}
