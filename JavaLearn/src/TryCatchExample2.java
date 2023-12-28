package JavaLearning;

public class TryCatchExample2 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
        } catch (ArithmeticException e) {
            System.out.println(e);

        }
        System.out.println("Rest of the code");
    }
}
