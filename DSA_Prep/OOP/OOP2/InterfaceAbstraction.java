
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

// Interface can extend other interfaces using 'extends' Keyword.
interface NewInterface extends Language1,Language2{
     // by default public static final
    String type = "programming language";

    // by default public
    void name(String name);

    // After the release of Java 8, we can add implementation inside an interface, these methods are called default methods. ex:
    public default void getDetails(){
        System.out.println("Body implemented inside interface and default keyword is necessary.");
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
