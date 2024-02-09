import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();


//        To push the value on stack
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cow");

        System.out.println(animals);


//        to check which element on the TOP
        System.out.println(animals.peek()); // peek used to check TOP value

//        to pop the value
        animals.pop();
        System.out.println(animals);

    }
}
