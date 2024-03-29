package DSA_Prep.OOP.OOP1;

public class ConstructorOverloading {

    // Constructor cannot be abstract, final, and static.


    String language; 

    // constructor with no parameter
    ConstructorOverloading(){
        this.language = "Java";
    }

    // constructor with a single parameter
    ConstructorOverloading(String language){
        this.language = language;
    }

    public void getName(){
        System.out.println("Programming Language: " + this.language);
    }

    public static void main(String[] args) {
        
        // call constructor with no parameter
        ConstructorOverloading obj1 = new ConstructorOverloading();

        // call constructor with a single parameter
        ConstructorOverloading obj2 = new ConstructorOverloading("Python");

        obj1.getName();
        obj2.getName();
    }
}
