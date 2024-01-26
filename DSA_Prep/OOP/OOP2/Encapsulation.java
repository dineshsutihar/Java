

// Encapsulation is one of the key feature of oop. it refers to the bundling of fields and methods inside a single class. 

// It prevents outer classes from accessing and changing fields and methods of class. This also helps to achieve data hiding. 

// Encapsulation helps to keep related fields and methods together, which makes our code cleaner and easy to read. it also help to control the values of our data fields. 

// here is an example of data hiding with encapsulation.

class Person {

    // private field : restrict unauthorized access from outside the class. This is data hiding.
    private int age;

    // getter method
    public int getAge(){
        return age;
    }

    // setter method
    public void setAge(int age){
        this.age=age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        // create an object of Person
        Person p1 = new Person();

        // change age using setter 
        p1.setAge(20);

        // accessing the age using getter
        System.out.println("My age is "+ p1.getAge());
        
    }
}
