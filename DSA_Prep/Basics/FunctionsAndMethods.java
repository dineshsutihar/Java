public class FunctionsAndMethods {
    public static void printName(){
        System.out.println("Dinesh Kumar");
    }

    // function with return type
    public static int add(int a, int b){
        return a + b;
    }

    // factorial of a number
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        printName();
        add(3, 30);
        System.out.println(add(3, 30));
        System.out.println(factorial(5));
    }
}
