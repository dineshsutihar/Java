package JavaLearning;

public class DemotoString {
    public static void main(String[] args) {
        // create a new Person object
        Person person = new Person("John", 30);

        // print the object using the toString() method
        System.out.println(person.toString());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // override the toString() method to return a string representation of the
    // object
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}