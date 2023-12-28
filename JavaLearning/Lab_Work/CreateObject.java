package JavaLearning.Lab_Work;

public class CreateObject {
    void disp() {
        System.out.println("This Is Dinesh");
    }

    public static void main(String[] args) {
        // Creating an object usign new keyword
        CreateObject obj = new CreateObject();
        // invoking method using the object
        obj.disp();
    }
}