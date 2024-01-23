package DSA_Prep.OOP.OOP2;

// Abstract class
abstract class Language {
    // to contain abstract method class must be abstract else it will throw error.
    // abstract method : these methods does not have body 
    abstract void method1();

    // constructor of Abstract class
    Language(){
        System.out.println("This is Language Constructor.");
    }

    // regular method
    void method2(){
        System.out.println("This is regular method");
    }
    
}

class Domain extends Language {

    // Constructor
    Domain(){
        super();
        System.out.println("This is Domain Constructor.");
    }

    // provide implementation of abstract method
    public void method1(){
        System.out.println("This is Java");
    }
}

// Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.

public class AbstractionInJava {
    public static void main(String[] args) {
        // Abstract class in java cannot be instantiated (we cannot create object of abstract classes).
        // 'abstract' keyword is used to declare the classes, For ex:
        Domain d = new Domain();
        d.method1();
        d.method2();
    }
}
