package JavaLearning.Lab_Work;

interface Sayable {
    default void say() {
        System.out.println("This is a default method.");
    }

    @SuppressWarnings("unused")
    private void saySomething() {
        System.out.println("Hello... I'm private method.");
    }
}

class PrivateInterface implements Sayable {
    public void callSay() {
        say(); // calling default method
    }

    public void callSaySomething() {
        // calling private method indirectly through a public method
        
        //saySomething();
    }
}

public class MainClass {
    public static void main(String[] args) {
        PrivateInterface p = new PrivateInterface();
        p.callSay();
        p.callSaySomething();
    }

}