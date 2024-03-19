
interface Sayable {
    default void say() {
        System.out.println("Hello... I'm default method");
    }

    @SuppressWarnings("unused")
    private void saySomething() {
        System.out.println("Hello... I'm private method");
    }
}

class PrivateInterface implements Sayable {
    public void callSayMethods() {
        say(); // call to the default method of the interface
        //saySomething(); /*
//                         * This line will not compile as private
//                         * methods cannot be accessed from outside the interface.
//                         */
    }
}

public class Experiment7 {

    public static void main(String[] args) {
        PrivateInterface obj = new PrivateInterface();
        obj.callSayMethods();
    }

}
