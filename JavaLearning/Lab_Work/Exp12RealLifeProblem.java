package JavaLearning.Lab_Work;

// Shape.java
abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw();

    public abstract void fillColor(String color);

    public abstract double area();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        // implementation of draw for Circle
    }

    @Override
    public void fillColor(String color) {
        // implementation of fillColor for Circle
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Rectangle.java
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(int x, int y, String color, double width, double height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        // implementation of draw for Rectangle
    }

    @Override
    public void fillColor(String color) {
        // implementation of fillColor for Rectangle
    }

    @Override
    public double area() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

// Triangle.java
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(int x, int y, String color, double base, double height) {
        super(x, y, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        // implementation of draw for Triangle
    }

    @Override
    public void fillColor(String color) {
        // implementation of fillColor for Triangle
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

// ShapeDrawingProgram.java
public class Exp12RealLifeProblem {
    public static void main(String[] args) {
        Shape circle = new Circle(10, 10, "red", 5.0);
        Shape rectangle = new Rectangle(20, 20, "green", 10.0, 5.0);
        Shape triangle = new Triangle(30, 30, "blue", 5.0, 8.0);

        circle.draw();
        circle.fillColor("yellow");
        System.out.println("Circle area: " + circle.area());

        rectangle.draw();
        rectangle.fillColor("orange");
        System.out.println("Rectangle area: " + rectangle.area());

        triangle.draw();
        triangle.fillColor("purple");
        System.out.println("Triangle area: " + triangle.area());
    }
}
