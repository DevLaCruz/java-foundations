package oop;

public enum CarType {
    SEDAN("Sedan", "Medium-sized car", 4),
    STATION_WAGON("Station Wagon", "Large car", 5),
    HATCHBACK("Hatchback", "Compact car", 5),
    PICKUP("Pickup", "Truck", 4),
    COUPE("Coupe", "Small car", 2),
    CONVERTIBLE("Convertible", "Sports car", 2),
    VAN("Van", "Utility car", 3),
    SUV("SUV", "Sport utility vehicle", 5);

    private final String name;
    private final int numberOfDoors;
    private final String description;

    CarType(String name, String description, int numberOfDoors) {
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getDescription() {
        return description;
    }
}
