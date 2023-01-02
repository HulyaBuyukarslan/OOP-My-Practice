package exceptions_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E3 {
    public static void main(String[] args) {

        try {
            FileInputStream f = new FileInputStream("src/daypackage/TextFile");
            int i = 0;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }
            f.close();
        } catch(FileNotFoundException e) {
            System.out.println("Most probably path is wrong or someone deleted my file");
        } catch(IOException e) {
            System.out.println("Text could not be read or the file could not be closed");
        } finally {
            System.out.println("Do not forget to close the file!");
        }
    }


    }
