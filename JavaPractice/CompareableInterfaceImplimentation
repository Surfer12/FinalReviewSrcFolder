```java 

public interface Comparable<T> {
    int compareTo(T other);
}

public class Integer implements Comparable<Integer> {
    @Override
    public int compareTo(Integer other) {
        return this - other;
    }
}

public class String implements Comparable<String> {
    @Override
    public int compareTo(String other) {
        return this.compareTo(other);
    }
}
```

In this example, the Comparable interface defines a compareTo method that must be implemented by any class that implements the interface. The Integer and String classes implement the Comparable interface by providing their own implementations of the compareTo method. This allows instances of these classes to be compared and sorted

Inner Classes

Inner classes are classes that are defined inside another class. There are four types of inner classes in Java:

Static inner classes: Static inner classes can only be accessed using the outer class name.
Non-static inner classes: Non-static inner classes can only be accessed by creating an instance of the outer class.
Local inner classes: Local inner classes can only be accessed within the method or block in which they are defined.
Anonymous inner classes: Anonymous inner classes are inner classes that do not have a name.
Example

Here is an example of how inner classes can be used in Java:

```java
public class OuterClass {
    private int x;

    public class InnerClass {
        public void printX() {
            System.out.println(x);
        }
    }

    public void printInnerClass() {
        InnerClass innerClass = new InnerClass();
        innerClass.printX();
    }
}
```

In this example, the OuterClass class has an inner class called InnerClass. The InnerClass class can access the private x field of the OuterClass class because it is an inner class of OuterClass.

Enums

Enums are a special type of data type in Java that can be used to represent a fixed set of constants. Enums are often used to define a set of related values, such as the days of the week or the months of the year.

Example

Here is an example of how enums can be used in Java:

```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public void printDay(Day day) {
    System.out.println("Today is " + day);
}
```

In this example, the Day enum defines a set of constants for the days of the week. The printDay method can be used to print the current day of the week.