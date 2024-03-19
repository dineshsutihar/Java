package JavaLearning.Test;

public class ThrowsFH {
    public static void main(String[] args) {
        calc obj = new calc();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("Something wrong " + e);
        }

    }
}

class calc {
    @SuppressWarnings("unused")
    void show() throws Exception {
        int x = 20, y;
        y = x / 0;
    }
}