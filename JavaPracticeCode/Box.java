package JavaPracticeCode;

public class Box<T> {
    private T content;

    /**
     * Places an item of type T into the box.
     * 
     * @param item The item to be placed in the box.
     */
    public void put(T item) {
        this.content = item;
    }

    /**
     * Retrieves the item from the box.
     * 
     * @return The item stored in the box.
     */
    public T get() {
        return content;
    }

    /**
     * Demonstrates the use of the Box class with generics.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.put(10);
        System.out.println("Integer Box: " + intBox.get());

        // Creating a Box for String
        Box<String> strBox = new Box<>();
        strBox.put("Hello, World!");
        System.out.println("String Box: " + strBox.get());
    }
}
