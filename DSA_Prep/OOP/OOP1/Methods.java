package DSA_Prep.OOP.OOP1;

public class Methods {
    // A method is a block of code which only runs when it is called.

    // create a method
    public int addNumber(int a, int b){
        return a + b;
    }

    // Create a static method which can be used without creating an object of the class.

    public static int subtractNumber(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;

        // create an object of Methods
        Methods obj = new Methods();

        // call the addNumber() method
        int result = obj.addNumber(num1, num2);
        System.out.println("Sum is: " + result);

        // call the subtractNumber() method
        int result2 = subtractNumber(num1, num2);
        System.out.println("Difference is: " + result2);

    }
}
