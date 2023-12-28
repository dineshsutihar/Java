package JavaLearning.Lab_Work;

public class CreateObjectExample1 {
    void show() {
        System.out.println("This is test.");
    }

    public static void main(String[] args) {
        // creating an object using new keyword
        CreateObjectExample1 obj = new CreateObjectExample1();
        // invoking method using the object
        obj.show();
    }
}