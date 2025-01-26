package oop;

import java.util.Date;

public class CarExample {
    public static void main(String[] args) {

        Engine subaruEngine = new Engine(2.0, EngineType.GASOLINE);
        Car subaru = new Car("Subaru", "Impreza");
        subaru.setEngine(subaruEngine);
        subaru.setFuelTank(new FuelTank());
        subaru.setColor(Color.WHITE);

        Engine mazdaEngine = new Engine(3.0, EngineType.DIESEL);
        Car mazda = new Car("Mazda", "BT-50", Color.RED, mazdaEngine);
        mazda.setFuelTank(new FuelTank(45));
        System.out.println("mazda.manufacturer = " + mazda.getManufacturer());

        Car nissan = new Car("Nissan", "Navara", Color.DARK_GRAY,
                new Engine(4.0, EngineType.DIESEL), new FuelTank(50));

        Car nissan2 = new Car("Nissan", "Navara", Color.DARK_GRAY,
                new Engine(3.5, EngineType.GASOLINE), new FuelTank(50));

        Car car = new Car();
        Date date = new Date();
        System.out.println("are they equal? " + (nissan == nissan2));
        System.out.println("are they equal with equals? " + (nissan.equals(nissan2)));
        System.out.println(subaru.viewDetail());
        System.out.println(mazda.viewDetail());
        System.out.println(nissan.viewDetail());

        System.out.println(car.equals(date));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.accelerate(3000));
        System.out.println(subaru.brake());

        System.out.println(mazda.accelerateBrake(4000));

        System.out.println("Kilometers per liter: " + subaru.calculateFuelConsumption(300, 0.6f));

        System.out.println("Kilometers per liter: " + subaru.calculateFuelConsumption(300, 60));
        System.out.println("Kilometers per liter: " + nissan.calculateFuelConsumption(300, 60));
    }
}
