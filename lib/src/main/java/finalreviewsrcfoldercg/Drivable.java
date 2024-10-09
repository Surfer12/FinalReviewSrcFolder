package finalreviewsrcfoldercg;

public interface Drivable {
    // Abstract method
    void drive();

    // Default method
    default void start() {
        System.out.println("Vehicle is starting.");
    }

    // Static method
    static void checkLicense() {
        System.out.println("Checking the license of the driver.");
    }
}