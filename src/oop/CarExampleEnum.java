package oop;

public class CarExampleEnum {
    public static void main(String[] args) {

        Car.setStaticFuelTankCapacity(45);
        Car subaru = new Car("Subaru", "Impreza");
        subaru.setEngine(new Engine(2.0, EngineType.GASOLINE));
        subaru.setFuelTank(new FuelTank());
        subaru.setColor(Color.WHITE);
        subaru.setCarType(CarType.HATCHBACK);

        Car mazda = new Car("Mazda", "BT-50", Color.RED, new Engine(3.0, EngineType.DIESEL));
        mazda.setFuelTank(new FuelTank(45));
        mazda.setCarType(CarType.PICKUP);
        System.out.println("mazda.manufacturer = " + mazda.getManufacturer());

        CarType type = subaru.getCarType();
        System.out.println("subaru type: " + type.getName());
        System.out.println("subaru type description: " + type.getDescription());

        type = mazda.getCarType();
        switch (type) {
            case CONVERTIBLE:
                    System.out.println("The car is a sporty, two-door convertible");
            case COUPE:
                    System.out.println("It's a small two-door car, typically sporty");
            case VAN:
                    System.out.println("It's a utility car used for transportation, typically for businesses");
            case HATCHBACK:
                    System.out.println("It's a compact medium-sized car with a sporty appearance");
            case PICKUP:
                    System.out.println("It's a double-cab or truck vehicle");
            case SEDAN:
                    System.out.println("It's a medium-sized car");
            case STATION_WAGON:
                    System.out.println("It's a larger car with a big trunk...");
        }

        CarType[] types = CarType.values();
        for (CarType carType : types) {
            System.out.print(carType + " => " + carType.name() + ", " +
                    carType.getName() + ", " +
                    carType.getDescription() + ", " +
                    carType.getNumberOfDoors());
            System.out.println();
        }
    }
}
