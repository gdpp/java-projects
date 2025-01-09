# Java Foundations

## Variables
In Java, a variable is a container for storing data that can be used and manipulated within a program. Each variable has a type that defines the kind of data it can hold.

Example:
```java
int age = 25; // An integer variable
String name = "John"; // A string variable
```

## Data Types
Data types define the type of data that a variable can store. Java is statically typed, so each variable must be declared with a data type.

#### Common Data Types:
**Primitive**: int, double, boolean, char, etc.
**Non-Primitive**: String, arrays, objects, etc.

Example:
```java
int number = 10; // Integer
double price = 19.99; // Decimal number
boolean isAvailable = true; // Boolean
char grade = 'A'; // Character
```

## Concatenation
Concatenation in Java is the process of joining two or more strings or combining strings with other data types. The + operator is commonly used for this purpose.

Example:
```java
String firstName = "Jane";
String lastName = "Doe";
String fullName = firstName + " " + lastName; // "Jane Doe"

int age = 30;
String message = "Age: " + age; // "Age: 30"
```

## Constants
Constants are variables whose values cannot be changed once assigned. In Java, the final keyword is used to declare constants.

Example:
```java
final double PI = 3.14159;
final String WELCOME_MESSAGE = "Welcome to Java Programming";

// Uncommenting the line below will cause an error
// PI = 3.14;
```

#### Summary Example
```java
public class Main {
    public static void main(String[] args) {
        // Variables and Data Types
        int age = 25;
        double height = 5.9;
        String name = "Alice";
        boolean isStudent = true;

        // Concatenation
        String message = name + " is " + age + " years old.";
        System.out.println(message); // Output: Alice is 25 years old.

        // Constants
        final double GRAVITY = 9.8;
        System.out.println("Gravity: " + GRAVITY); // Output: Gravity: 9.8
    }
}
```