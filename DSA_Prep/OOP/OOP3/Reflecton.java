package DSA_Prep.OOP.OOP3;

import java.lang.Class;
import java.lang.reflect.*;

// To study in more details: https://www.programiz.com/java-programming/reflection

// Reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.

// There is a class in Java named Class that keeps all the information about ovjects and classes at runtime. The object of Class can be used to perform reflection.

// Reflection of java classes can be created in 3 ways: 
/*
    1. Using forName() method
    class Dog {...}

    // create object of Class
    // to reflect the Dog class
    Class a = Class.forName("Dog");
    Here, the forName() method takes the name of the class to be reflected as its argument.



    2. Using getClass() method

    // create an object of Dog class
    Dog d1 = new Dog();

    // create an object of Class
    // to reflect Dog
    Class b = d1.getClass();
    Here, we are using the object of the Dog class to create an object of Class.



    3. Using .class extension

    // create an object of Class
    // to reflect the Dog class
    Class c = Dog.class;
    Now that we know how we can create objects of the Class. We can use this object to get information about the corresponding class at runtime.

*/
class Animal{

}

// put this class in different Dog.java file
public class Dog extends Animal{
    public void display(){
        System.out.println("I am a dog.");
    }
}

// put this in Main.java file
public class Reflecton {
    public static void main(String[] args) {
        try {
          // create an object of Dog
          Dog d1 = new Dog();
    
          // create an object of Class
          // using getClass()
          Class obj = d1.getClass();
    
          // get name of the class
          String name = obj.getName();
          System.out.println("Name: " + name);
    
          // get the access modifier of the class
          int modifier = obj.getModifiers();
    
          // convert the access modifier to string
          String mod = Modifier.toString(modifier);
          System.out.println("Modifier: " + mod);
    
          // get the superclass of Dog
          Class superClass = obj.getSuperclass();
          System.out.println("Superclass: " + superClass.getName());
        }
    
        catch (Exception e) {
          e.printStackTrace();
        }
      }
}

// diffenet methods of Class class:

// 1. getName() => returns the name of the class.
// 2. getModifiers() => returns the access modifier of the class.
// 3. getSuperclass() => returns the superclass of the class.
// 4. getInterfaces() => returns the interfaces implemented by the class.
// 5. getFields() => returns the public fields of the class.
// 6. getConstructors() => returns the public constructors of the class.
// 7. getMethods() => returns the public methods of the class.
// 8. getDeclaredFields() => returns the fields of the class.
// 9. getDeclaredConstructors() => returns the constructors of the class.
// 10. getDeclaredMethods() => returns the methods of the class.
// 11. getDeclaredClasses() => returns the classes of the class.
// 12. getPackage() => returns the package of the class.
// 13. getAnnotations() => returns the annotations of the class.
// 14. getAnnotation() => returns the annotation of the class.
// 15. isInterface() => returns true if the class is an interface.
// 16. isArray() => returns true if the class is an array

    //.......
