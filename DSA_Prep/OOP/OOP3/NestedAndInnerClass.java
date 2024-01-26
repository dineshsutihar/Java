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


public class NestedAndInnerClass {

    
}