package finalreviewsrcfoldercg;

public class CarOOP implements Drivable {
    // Fields (encapsulation)
    private String make;
    private String model;
    private int year;

    // Constructor
    public CarOOP(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }

    // Methods
    public void startEngine() {
        System.out.println("The " + make + " " + model + " engine is starting.");
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public void startElectricEngine() {
        System.out.println("The " + make + " " + model + " electric engine is starting.");
    }

    public void checkLicense() {
        System.out.println("The " + make + " " + model + " has a valid license.");
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        CarOOP myCar = new CarOOP("Toyota", "Corolla", 2020);
        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model S", 2021, 100);
        myCar.startEngine();
        myElectricCar.startElectricEngine();
        myCar.drive();
        Drivable.checkLicense();
    }
}