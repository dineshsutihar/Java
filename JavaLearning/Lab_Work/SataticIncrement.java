package JavaLearning.Lab_Work;

public class SataticIncrement {
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println(incrementCounter());
        System.out.println(incrementCounter());
        System.out.println(incrementCounter());
    }

    private static int incrementCounter() {
        counter++;
        return counter;
    }
}
