package finalreviewsrcfoldercg;

public enum Day {
    // Enum constants
    SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"),
    THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");

    // Field in enum
    private final String shortName;

    // Constructor
    Day(String shortName) {
        this.shortName = shortName;
    }

    // Method in enum
    public String getShortName() {
        return this.shortName;
    }

    // Main method to run a test
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + " short form is " + day.getShortName());
        }
    }
}