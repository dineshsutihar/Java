package JavaLearning;

interface Polygon {
    void getArea();

    default void getSides() {
        System.out.println("I have n sides.");
    }
}

class Rectangle implements Polygon {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void getArea() {
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    @Override
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}

class Square implements Polygon {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    public void getArea() {
        int area = side * side;
        System.out.println("The area of the square is " + area);
    }

    @Override
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}

public class Experiment8 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.getArea();
        rectangle.getSides();
        Square square = new Square(5);
        square.getArea();
        square.getSides();
    }
}
