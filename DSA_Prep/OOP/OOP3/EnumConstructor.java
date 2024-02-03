package DSA_Prep.OOP.OOP3;

// enum constructor can be of two types: private or package-private

enum Size {

    // enum constant calling the enum constructors
    SMALL("The Size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    // private enum constructor
    private Size(String pizzaSize){
        this.pizzaSize = pizzaSize;
    }

    public String getSize(){
        return pizzaSize;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println("Size is: " + size.getSize());
    }
}
