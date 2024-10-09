package JavaPracticeCode;

public class ElectricCar extends CarOOP implements electricPowered {
    private int batteryCapacity;
    private String model;
    private String make;
    private int year;

    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("The " + getMake() + " " + getModel() + " is powering up silently.");
    }

    public void chargeBattery() {
        System.out.println("Charging the battery...");
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

}