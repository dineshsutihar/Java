package JavaLearning.Lab_Work;

public class lab4 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Temp1 obj1 = new Temp1();
        Temp1 obj2 = new Temp1(5);
        Temp1 obj3 = new Temp1(4, 6);
    }
}

class Temp1 {
    @SuppressWarnings("unused")
    private int num1;
    @SuppressWarnings("unused")
    private int num2;

    public Temp1() {
        this(0);
    }

    public Temp1(int num) {
        this(num, 1);
    }

    public Temp1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
    }
}
