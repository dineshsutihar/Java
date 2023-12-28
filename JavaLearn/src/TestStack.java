package JavaLearning;

class Stack {
    private int stck[] = new int[10];
    private int tos;

    // initalization top-of-stack
    Stack() {
        tos = -1;

    }

    // Push and item onto the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is Full.");

        } else {
            stck[++tos] = item;

        }
    }

    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("System Underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }

}

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack is mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }

    }
}
