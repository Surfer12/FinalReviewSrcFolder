6. A java program that calculates the area of a circle that accepts the radius from the user. The program should also calculate the perimeter of the circle. The formula for the area of a circle is A = πr^2 and the formula for the perimeter of a circle is P = 2πr. The program should have a class Circle with the following attributes: radius, area, and perimeter. The class should have the following methods: getRadius(), getArea(), getPerimeter(), and main(). The main() method should accept the radius from the user, create a Circle object with the radius, and print the area and perimeter of the circle. 
6.1 Create a class diamgram and a flowchart. 
```java
import java.util.Scanner;
public class Circle {
    private double radius;
    private double area;
    private double perimeter;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    } 
    public double getArea() {
        area = Math.PI * (radius * radius);
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter());
    }
}
```
Question 7:

What is the difference between a local variable and an instance variable in Java? 

A local variable is a variable that is defined within the scope of a method or a block of code. It is created when the method is called and is destroyed when the method exits, meaning it is not accessible outside of that method. In contrast, an instance variable is defined within a class but outside of any method. It is associated with an instance of the class (an object) and exists as long as the object exists. Instance variables can be accessed by all methods within the class. Local variables are stored on the stack, while instance variables are stored on the heap. Local variables are destroyed when the method exits, while instance variables are destroyed when the object is destroyed. 

How is the object destroyed? 

The object is destroyed when the garbage collector reclaims the memory that the object was occupying. The garbage collector is a program that runs in the background and reclaims memory that is no longer being used by the program. The garbage collector will destroy the object when it determines that the object is no longer needed by the program. 

Question 8:

Consider the following code:

```java
String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
    System.out.println(name);
}
```

What kind of loop is used in this code? Why is it useful?


This loop is commonly known as an "enhanced for loop" or "for-each loop." Here's why it's so useful:

Simplicity: It provides a concise and readable way to iterate over the elements of an array or collection.
Safety: It eliminates the risk of index-out-of-bounds errors that can occur with traditional for loops.
Readability: The syntax is clear and intuitive, making it easy to understand what the loop is doing.


