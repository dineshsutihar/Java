package DSA_Prep.OOP.OOP1;

public class MethodOverloading {

    // Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.

    // it is just related to parameter list, not return type.

    // Method Overloading is a compile-time polymorphism.

    private static int add(int a, int b){
        return a + b;
    }

    private static int add(int a, int b, int c){
        return a + b + c;
    }

    private static double add(double a, double b){
        return a + b;
    }

     // this method accepts int
     private static void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5, 20.5));

        display(1);
        display("Hello");

    }

    // Note:
    /*
        1. Two or more methods can have the same name inside   the same class if they accept different arguments. This feature is known as method overloading.
        2. Method overloading is achieved by either:
            i. changing the number of arguments.
            ii. or changing the data type of arguments.
        3. It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.
     */


    
}
