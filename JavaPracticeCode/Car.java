package JavaPracticeCode;

public class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Calls the default method
        myCar.drive(); // Calls the overridden method
        Drivable.checkLicense(); // Calls the static method
    }
}