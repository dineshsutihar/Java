# Java Annotations
- Annotations are used to provide metadata for Java code.
- Annotations do not change action of a compiled program.
- Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.

Annotations starts with @. Its syntax is :
```java
@AnnotationName
```
- Annotations can be used to provide information to the compiler to detect errors and suppress warnings.

## Annotations formats:
 Annotations can be applied to classes, methods, fields, parameters, and local variables.

### 1. Marker Annotations
- Marker annotations do not have any elements. It is only used for marking the declaration.
- Example:
```java
@AnnotationName()

@Override
```
### 2. Single Value Annotations
- Single value annotations have only one element.
-Its syntax is:
```java
@AnnotationName(elementName = "elementValue")
```
If there is only one element, it is a convention to name that element as value.
```java
@AnnotationName(value ="elementValue")
```
In this case, the element name can be excluded as well. The element name will be value by default.
```java
@AnnotationName("elementValue")
```
### 3. Multi-Value Annotations
- Multi-value annotations have more than one element.
- Its syntax is:
```java
@AnnotationName(elementName1 = "elementValue1", elementName2 = "elementValue2")
```


### Built-in Annotations

#### Predefined annotations
- `@Deprecated`: Marks the annotated element as deprecated, indicating that it should no longer be used.
- `@Override`: Indicates that a method declaration is intended to override a method declaration in a superclass.
- `@SuppressWarnings`: Indicates that the named compiler warnings should be suppressed in the annotated element (and in all program elements contained in the annotated element).
- `@SafeVarargs`: Suppresses unchecked warnings about a non-reifiable variable arity (vararg) type and suppresses unchecked warnings about parameterized array creation at call sites.
- `@FunctionalInterface`: Indicates that an interface is intended to be a functional interface as defined by the Java Language Specification.

#### Meta-annotations
- `@Retention`: Indicates how long annotations with the annotated type are to be retained.
- `@Documented`: Indicates that annotations with a type are to be documented by javadoc and similar tools by default.
- `@Target`: Indicates the kinds of program element to which an annotation type is applicable.
- `@Inherited`: Indicates that an annotation type is automatically inherited.
- `@Repeatable`: Indicates that the annotation type whose declaration it (meta-)annotates is repeatable.

#### Custom annotations
- Custom annotations can be created by the user for specific needs. 

### Use of Annotations

1. **Compiler instructions**: Annotations can be used for giving instructions to the compiler, detect errors or suppress warnings. The built-in annotations `@Deprecated`, `@Override`, `@SuppressWarnings` are used for these purposes.

2. **Compile-time instructions**: Compile-time instructions provided by these annotations help the software build tools to generate code, XML files and many more.

3. **Runtime instructions**: Some annotations can be defined to give instructions to the program at runtime. These annotations are accessed using Java Reflection.


### Annotation Placement

Any declaration can be marked with an annotation by placing it above that declaration. As of Java 8, annotations can also be placed before a type.

1. **Above declarations**: As mentioned above, Java annotations can be placed above class, method, interface, field, and other program element declarations.

    **Example 2: @SuppressWarnings Annotation Example**
    ```java
    import java.util.*;

    class Main {
      @SuppressWarnings("unchecked")
      static void wordsList() {
        ArrayList wordList = new ArrayList<>();

        // This causes an unchecked warning
        wordList.add("programiz"); 

        System.out.println("Word list => " + wordList);
      }

      public static void main(String args[]) {
        wordsList();
      }
    }
    ```
    If the above program is compiled without using the `@SuppressWarnings("unchecked")` annotation, the compiler will still compile the program but it will give warnings like:

    ```
    Main.java uses unchecked or unsafe operations.
    Word list => [programiz]
    ```

    We are getting the warning `Main.java uses unchecked or unsafe operations` because of the following statement.

    ```java
    ArrayList wordList = new ArrayList<>();
    ```
    This is because we haven't defined the generic type of the array list. We can fix this warning by specifying generics inside angle brackets <>.

    ```java
    ArrayList<String> wordList = new ArrayList<>();
    ```

2. **Type annotations**: Before Java 8, annotations could be applied to declarations only. Now, type annotations can be used as well. This means that we can place annotations wherever we use a type.

    - **Constructor invocations**
      ```java
      new @Readonly ArrayList<>()
      ```
    - **Type definitions**
      ```java
      @NonNull String str;
      @NonNull List<String> newList;
      List<@NonNull String> newList;
      ```
    - **Type casts**
      ```java
      newStr = (@NonNull String) str;
      ```
    - **extends and implements clause**
      ```java
      class Warning extends @Localized Message
      ```
    - **throws clause**
      ```java
      public String readMethod() throws @Localized IOException
      ```

    Type annotations enable Java code to be analyzed better and provide even stronger type checks.