package DSA_Prep.OOP;

public class Constructor {
    
    /*
    A constructor in Java is similar to a method that is invoked when an object of the class is created.

    Unlike Java methods, a constructor has the same name as that of the class and does not have any return type.
     */

     private int num; // instance variable

    // constructor without parameter 
    public Constructor(){ // default constructor
        System.out.println("This is an empty constructor");
    }

    // constructor with parameter
    public Constructor(int num){
        System.out.println("This is a parameterized constructor");
        this.num = num;
    }

    // private Constructor which cannot be called outside of the class

    private Constructor(String str){
        System.out.println("This is a private constructor");
    }

    public static void main(String[] args) {
            
            // this will invoke default constructor
            Constructor obj1 = new Constructor();
    
            // this will invoke the parameterized constructor
            Constructor obj2 = new Constructor(10);
    
            // this will invoke default constructor
            Constructor obj3 = new Constructor();
    
            // this will invoke the parameterized constructor
            Constructor obj4 = new Constructor(20);
    
            // this will invoke default constructor
            Constructor obj5 = new Constructor();
    
            // this will invoke the parameterized constructor
            Constructor obj6 = new Constructor(30);

            // this will invoke the private constructor
            // Constructor obj7 = new Constructor("Hello");
    }
}
