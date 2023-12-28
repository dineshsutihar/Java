package JavaLearning.Test;

interface Demo {
    int sum(int a, int b);
}

public class Lembdaexp {
    public static void main(String[] args) {
        Demo obj = (a, b) -> (a + b);
        System.out.println(obj.sum(4, 5));

    }
}
