package DSA_Prep.OOP.OOP3;

// class within another class is known as nested class.
// eg:
/*
 *  class OuterClass{
 *      //....
 *      class NestedClass{
 *          //......
 *      }
 *  }
 * 
 * two types of nested classes:
 *  1.Non-static nested class(inner class)
 *  2.Static nested class
 */

 /* 
// example of inner class:
class CPU{
    double price;

    // nested class
    class Processor{

        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

public class NestedAndInnerClass {
    public static void main(String[] args) {
        
        // create object of Outer class CPU
        CPU cpu = new CPU();

        // create an object of inner class Processor using outer class 
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}
*/



// -------------------------------------------------------------------
/*
// Example for Accessing Members 

class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type){
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName(){
        return this.carName;
    }

    // inner class\
    class Engine {
        String engineType;
        void setEngine(){

            // Accessing the carType property of Car
            if(Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if (Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                }  else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
            String getEngineType(){
                return this.engineType;
        }
    }
}

public class NestedAndInnerClass {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }
}
*/

// =====================================================================

// Static Nested Class
// Here we dont need to create the object of outer class to access the inner class;

class MotherBoard{
    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 3;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }
}

public class NestedAndInnerClass {

    public static void main(String[] args) {
        
        // create an object of the static nested class
        // using the name of the outer class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = "+ usb.getTotalPorts());
    }
}

/*
    Key point to remember:
    - Java treats the inner class as a regular member of a class. They are just like methods and variables declared inside a class.
    - Since inner classes are members of the outer class, you can apply any access modifiers like private, protected to your inner class which is not possible in normal classes.
    - Since the nested class is a member of its enclosing outer class, you can use the dot (.) notation to access the nested class and its members.
    - Using the nested class will make your code more readable and provide better encapsulation.
    - Non-static nested classes (inner classes) have access to other members of the outer/enclosing class, even if they are declared private.

 */