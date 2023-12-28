package JavaLearning.Lab_Work;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

public class Exp11Cohesion {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, 50000.0);

        employee.printName();
        employee.printAge();
        employee.printSalary();
    }
}
