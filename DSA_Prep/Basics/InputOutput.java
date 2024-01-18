import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("You entered: " + a);


        System.out.print("Enter a string: ");
        String b = input.next(); // nextLine() for whole line and next() for single word
        System.out.printf("You entered: %s",b);


        // Double input
        System.out.print("Enter a double: ");
        double c = input.nextDouble();
        System.out.printf("You entered: %f",c);

        // float input
        System.out.print("Enter a float: ");
        float d = input.nextFloat();
        System.out.printf("You entered: %f",d);

        // char input
        System.out.print("Enter a char: ");
        char e = input.next().charAt(0);
        System.out.printf("You entered: %c",e);
        


        input.close();
    }
}
