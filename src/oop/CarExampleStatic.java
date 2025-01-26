package oop;

public class CarExampleStatic {
    public static void main(String[] args) {

        Car.setStaticFuelTankCapacity(45);
        Car subaru = new Car("Subaru", "Impreza");
        subaru.setEngine(new Engine(2.0, EngineType.GASOLINE));
        subaru.setFuelTank(new FuelTank());
        subaru.setColor(Color.WHITE);
        subaru.setCarType(CarType.HATCHBACK);

        Car mazda = new Car("Mazda", "BT-50", Color.RED, new Engine(3.0, EngineType.DIESEL));
        mazda.setCarType(CarType.PICKUP);
        // mazda.setFuelTank(new FuelTank());
        System.out.println("mazda.manufacturer = " + mazda.getManufacturer());

        Car nissan = new Car("Nissan", "Navara", Color.DARK_GRAY,
                new Engine(4.0, EngineType.DIESEL), new FuelTank(50));
        nissan.setCarType(CarType.PICKUP);

        Car nissan2 = new Car("Nissan", "Navara", Color.DARK_GRAY,
                new Engine(3.5, EngineType.GASOLINE), new FuelTank(50));
        nissan2.setColor(Color.YELLOW);
        nissan2.setCarType(CarType.PICKUP);
        Car.setPatentColor(Color.BLUE);

        Car car = new Car();

        System.out.println(subaru.viewDetail());
        System.out.println(mazda.viewDetail());
        System.out.println(nissan.viewDetail());

        System.out.println(nissan2.viewDetail());
        System.out.println("Car.getLicensePlateColor() = " + Car.getPatentColor());
        System.out.println("Kilometers per liter = " + Car.calculateStaticFuelConsumption(300, 60));
        System.out.println("Maximum highway speed: " + Car.MAX_SPEED_ROAD);
        System.out.println("Maximum city speed: " + Car.MAX_SPEED_CITY);

        CarType subaruType = subaru.getCarType();
        System.out.println("Subaru type: " + subaruType.getName());
        System.out.println("Subaru type description: " + subaruType.getDescription());

        System.out.println(mazda.calculateFuelConsumption(300, 70));
    }
}
