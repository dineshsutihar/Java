# Java Class and Objects:

<p> An object is and entity tht has state and behavior. For example, a bycycle is an Object. It has </p>

- <b> State</b>  : idle, first gear, etc
- <b> Behaviors </b>: braking, acceleration, etc. 


### Class: 
A class is a blue print for the object. Before we create an Object. we first need to define the class. 

We can think of the class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows, etc. Based on these descriptions we build the house. House is the object.

Since many houses can be made from the same description, we can create many objects from a class.

<hr>

### Create a class in Java
```java
class ClassName {
  // fields
  // methods
}
```
Here, fields (variables) and methods represent the state and behavior of the object respectively.

- fields are used to store data
- methods are used to perform some operations


### Objects:

An object is called an instance of a class. For example, suppose Bicycle is a class then MountainBicycle, SportsBicycle, TouringBicycle, etc can be considered as objects of the class.

### Creating an Object in Java

```java
className object = new className();

// for Bicycle class
Bicycle sportsBicycle = new Bicycle();

Bicycle touringBicycle = new Bicycle();
```

We have used the new keyword along with the constructor of the class to create an object. Constructors are similar to methods and have the same name as the class. For example, Bicycle() is the constructor of the Bicycle class. To learn more, visit Java Constructors.

Here, sportsBicycle and touringBicycle are the names of objects. We can use them to access fields and methods of the class.

As you can see, we have created two objects of the class. We can create multiple objects of a single class in Java.

```
Note: Fields and methods of a class are also called members of the class.
```

<hr>

We can use the name of objects along with the . operator to access members of a class. For example,

```java
class Bicycle {

  // field of class
  int gear = 5;

  // method of class
  void braking() {
    ...
  }
}

// create object
Bicycle sportsBicycle = new Bicycle();

// access field and method
sportsBicycle.gear;
sportsBicycle.braking();
```