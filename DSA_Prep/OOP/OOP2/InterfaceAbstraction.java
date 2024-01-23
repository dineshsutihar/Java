package DSA_Prep.OOP.OOP2;


// An interface is a fully abstract class. It includes a group of abstract methods(methods without a body).

// The Keyword 'interface' is used to create an interface in java.

// create an interface
interface Language1 {
    void getName(String name);
}

// create another interface
interface Language2{
    void getName2(String name);
}

// implements interface
class ProgrammingLanguage implements Language1 {

    // implementations of abstract method
    public void getName(String name){
        System.out.println("Programming Language: " + name);
    }
}


// Implementing Multiple interfaces 
class Multi implements Language1,Language2{

    // Methods
    public void getName(String name){
        System.out.println(name);
    }

    public void getName2(String name) {
        System.out.println(name);
    }
}

public class InterfaceAbstraction {
    public static void main(String[] args) {
        
        ProgrammingLanguage pl = new ProgrammingLanguage();
        pl.getName("Java");

        // Multiple Interface Object
        Multi ml = new Multi();
        ml.getName("C++");
        ml.getName2("Python");

    }
    
}
