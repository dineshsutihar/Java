package DSA_Prep.OOP.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowAndThrows {
    


    public static void divideByZero() {

        // throw an exception
        throw new ArithmeticException("Trying to divide by 0");
    }


    // declareing the type of exception
    public static void findFile() throws IOException {

        // code that may generate IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

      
    public static void main(String[] args) {
        try {
            divideByZero();
            findFile();
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
            
        }
        catch (IOException e) {
            System.out.println(e);
        }
        // catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
        //     System.out.println(e.getMessage());
        //   }
    }


}
