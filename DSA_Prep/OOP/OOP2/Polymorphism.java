package DSA_Prep.OOP.OOP2;
// polymorphism is an important concept of oop it simply means more than one form.

class Polygon {
    // method to render a shape
    public void render(){
        System.out.println("Rendering Polygon....");
    }
}

class Square extends Polygon{
    // render Square
    public void render(){
        System.out.println("Rendering Square...");
    }
}

class Circle extends Polygon{
    // renders circle
    public void render(){
        System.out.println("Rendering Circle....");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        
        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // Create an object of Circle
        Circle c1 = new Circle();
        c1.render();
    }
}

/*
 * In the above example, we have created a superclass: Polygon and two subclasses: Square and Circle. Notice the use of the render() method.

The main purpose of the render() method is to render the shape. However, the process of rendering a square is different than the process of rendering a circle.

Hence, the render() method behaves differently in different classes. Or, we can say render() is polymorphic.


We can achieve polymorphism in Java using the following ways:

1. Method Overriding(@override)
2. Method Overloading (different parameters)
3. Operator Overloading : some operators behave diffenent like '+' cna concade and also add.
 */