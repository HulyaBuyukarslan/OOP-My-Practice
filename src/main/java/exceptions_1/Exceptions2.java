package exceptions_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions2 {
    public static void main(String[] args) throws IOException {

        FileInputStream f = new FileInputStream("src/day/TextF!le");
        int i = 0;
        while ((i = f.read()) != -1) {
            System.out.print((char) i);
        }
        f.close();
    }


    }
