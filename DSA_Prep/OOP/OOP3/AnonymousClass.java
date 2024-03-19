package DSA_Prep.OOP.OOP3;

import javax.swing.text.PlainDocument;

// A nested class that doesn't have any name is known a an anonymous class. An anonymous class must be defined inside another class. Hence, it is also known as an anonymous inner class. 

/*
 class outerClass {

    // defining anonymous class
    object1 = new Type(parameterList) {
         // body of the anonymous class
    };
 }



// Anonymous classes usually extend subclasses or implement interfaces.

//  Here, Type can be
    1. a superclass that an anonymous class extends
    2. an interface that an anonymous class implements
*/



@SuppressWarnings("unused")
class Polygon{
    public void display(){
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo{
    public void createClass(){

        // creation of anonymous class extending class Polygon 
        Polygon p1 = new Polygon(){
            public void display(){
                super.display();
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display(); 
        
    }
}

class AnonymousClass{
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}