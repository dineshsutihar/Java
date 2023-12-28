package JavaLearning;

interface Sayable {
    default void say() {
        saySomething();
    }

    // Private method inside interface
    private void saySomething() {
        System.out.println("Hello... Iam Private Method");
    }
}

public class PrivateInterface implements Sayable {
    public static void main(String[] args) {
        Sayable s = new PrivateInterface();
        s.say();
    }
}