import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("You entered: " + a);

        
        System.out.print("Enter a string: ");
        String b = input.next();
        System.out.printf("You entered: %s",b);


        input.close();
    }
}
