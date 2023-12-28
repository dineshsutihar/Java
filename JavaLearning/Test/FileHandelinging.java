package JavaLearning.Test;

import java.util.Scanner;

class MyCustomException extends Exception {
    MyCustomException(String string) {
        super(string);
    }

}

public class FileHandelinging {
    public static void main(String[] args) {
        int y;
        try( Scanner input = new Scanner(System.in))
         {
           
            y = input.nextInt();
            if (y == 1)
                throw new MyCustomException("This is custom Exception");
        } catch (MyCustomException e) {
            System.out.println("something is wrong " + e);
        } finally {
            System.out.println("Thsi is finally block");
        }
    }
}
