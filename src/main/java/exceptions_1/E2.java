package exceptions_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E2 {
    public static void main(String[] args) {


    try {
        FileInputStream f = new FileInputStream("src/daypackage/TextFile");
    } catch(FileNotFoundException e) {
        System.out.println("Good");
    } catch(IOException e) {
        System.out.println("Bad");
    }finally {
        System.out.println("Not bad");
    }
}









}
