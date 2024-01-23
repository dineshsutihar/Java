package DSA_Prep.OOP.OOP2;

class Animal {
    // methods and fields 

    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    // methods and fields of Animal 
    // methods and fields of Dog
    public void display(){
        System.out.println("My name is " + name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //  Inheritance is one of the key features of OOP that allows us to create a new class from an existing class. 
        
        //  The new class that is created is known as subclass and the exitsting class from where the child class is derived is known as superclass. 

        // We will use 'extends' keyword to perform inheritance.


        // Creating the object of Dog class
        Dog labrador = new Dog();

        labrador.name="Rohu";
        labrador.display();

        // call method of superclass 
        // using objecct of subclass

        labrador.eat();
    }
}


// NOTE: inheritance is an is-a relationship. Means we use it only if there exitst an is-a relationship between two classes. For example:

/*
 * 'Car' is a 'Vehicle'
 * 'Orange' is a 'Fruit'
 * 'Surgeon' is a 'Doctor'
 * 'Dog' is an 'Animal'
 */




//  Method Overriding in java Inheritance