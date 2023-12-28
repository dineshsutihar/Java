package JavaLearning.Lab_Work;

class Shape {
    public void area() {
    }

    public void perimeter() {
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}

public class Exp10 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();
        circle.perimeter();

        Rectangle rectangle = new Rectangle(5, 7);
        rectangle.area();
        rectangle.perimeter();

        Square square = new Square(5);
        square.area();
        square.perimeter();
    }
}