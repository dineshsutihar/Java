
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            int data = 50 / 0;// may throw exception
            // if exception occurs, the remaining statement will not execute
            System.out.println("Rest of Code");

            // handling the exception
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
