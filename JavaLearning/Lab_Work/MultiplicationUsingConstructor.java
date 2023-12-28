package JavaLearning.Lab_Work;

public class MultiplicationUsingConstructor {
    public static void main(String[] args) {
        Temp obj3 = new Temp(5, 16);
    }

}

class Temp {
    Temp() {
        System.out.println("Default Constructor");

    }

    Temp(int x) {
        this();
        System.out.printf("Single parametrized constructor(%d)\n", x);
        System.out.println(x);
    }

    Temp(int x, int y) {
        this(5);
        System.out.printf("Two Parameterized constructor (%d,%d)\n", x, y);
        System.out.println(x * y);

    }
}
