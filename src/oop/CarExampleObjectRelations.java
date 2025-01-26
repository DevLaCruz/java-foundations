package oop;

public class CarExampleObjectRelations {
    public static void main(String[] args) {

        Person subaruDriver = new Person("Luci", "Martínez");
        Car subaru = new Car("Subaru", "Impreza");
        subaru.setEngine(new Engine(2.0, EngineType.GASOLINE));
        subaru.setFuelTank(new FuelTank());
        subaru.setColor(Color.WHITE);
        subaru.setCarType(CarType.HATCHBACK);
        subaru.setDriver(subaruDriver);
        // subaru.setWheels(subaruWheels);
        Wheel[] subaruWheels = new Wheel[10];
        for (int i = 0; i < subaruWheels.length; i++) {
            subaru.addWheel(new Wheel("Yokohama", 16, 7.5));
        }

        Person pato = new Person("Pato", "Rodríguez");
        Car mazda = new Car("Mazda", "BT-50", Color.RED, new Engine(3.0, EngineType.DIESEL));
        mazda.setCarType(CarType.PICKUP);
        mazda.setFuelTank(new FuelTank());
        mazda.setDriver(pato);
        // mazda.setWheels(mazdaWheels);

        Wheel[] mazdaWheels = new Wheel[5];
        for (int i = 0; i < mazdaWheels.length; i++) {
            mazda.addWheel(new Wheel("Michelin", 18, 10.5));
        }

        Person bea = new Person("Bea", "González");
        Car nissan = new Car("Nissan", "Navara", Color.DARK_GRAY,
                new Engine(4.0, EngineType.DIESEL), new FuelTank(50));
        nissan.setDriver(bea);
        nissan.setCarType(CarType.PICKUP);

        nissan.addWheel(new Wheel("Pirelli", 20, 11.5))
                .addWheel(new Wheel("Pirelli", 20, 11.5))
                .addWheel(new Wheel("Pirelli", 20, 11.5))
                .addWheel(new Wheel("Pirelli", 20, 11.5))
                .addWheel(new Wheel("Pirelli", 20, 11.5));

        Wheel[] nissanWheels2 = {new Wheel("Pirelli", 20, 11.5),
                new Wheel("Pirelli", 20, 11.5),
                new Wheel("Pirelli", 20, 11.5),
                new Wheel("Pirelli", 20, 11.5),
                new Wheel("Pirelli", 20, 11.5)};

        Person lalo = new Person("Lalo", "Mena");
        Car nissan2 = new Car("Nissan", "Navara", Color.DARK_GRAY,
                new Engine(3.5, EngineType.GASOLINE), new FuelTank(50), lalo, nissanWheels2);
        nissan2.setColor(Color.YELLOW);
        nissan2.setCarType(CarType.PICKUP);
        Car.setPatentColor(Color.BLUE);

        Car car = new Car();

        System.out.println(subaru.viewDetail());
        System.out.println(mazda.viewDetail());
        System.out.println(nissan.viewDetail());
        System.out.println(nissan2.viewDetail());

        /*System.out.println("Subaru driver: " + subaru.getDriver());
        System.out.println("Subaru wheels: ");
        for (Wheel w : subaru.getWheels()) {
            System.out.println(w.getManufacturer() + ", rim: " + w.getRim() + ", width: " + w.getWidth());
        }*/
    }
}
