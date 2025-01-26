package oop;
import java.util.Arrays;

public class CarArrayExample {
    public static void main(String[] args) {

        Person subaruDriver = new Person("Luci", "Martínez");
        Car subaru = new Car("Subaru", "Impreza");
        subaru.setEngine(new Engine(2.0, EngineType.GASOLINE));
        subaru.setFuelTank(new FuelTank());
        subaru.setColor(Color.WHITE);
        subaru.setCarType(CarType.HATCHBACK);
        subaru.setDriver(subaruDriver);

        Person pato = new Person("Pato", "Rodríguez");
        Car mazda = new Car("Mazda", "BT-50", Color.RED, new Engine(3.0, EngineType.DIESEL));
        mazda.setCarType(CarType.PICKUP);
        mazda.setFuelTank(new FuelTank());
        mazda.setDriver(pato);

        Person bea = new Person("Bea", "González");
        Car nissan = new Car("Nissan", "Navara", Color.DARK_GRAY,
                new Engine(4.0, EngineType.DIESEL), new FuelTank(50));
        nissan.setDriver(bea);
        nissan.setCarType(CarType.PICKUP);

        Person lalo = new Person("Lalo", "Mena");
        Car suzuki = new Car("Suzuki", "Vitara", Color.DARK_GRAY,
                new Engine(1.6, EngineType.GASOLINE), new FuelTank(50));
        suzuki.setDriver(lalo);
        suzuki.setColor(Color.YELLOW);
        suzuki.setCarType(CarType.SUV);
        Car.setPatentColor(Color.BLUE);

        Car audi = new Car("Audi", "A3");
        audi.setDriver(new Person("Jano", "Pérez"));

        Car[] cars = new Car[5];
        cars[0] = subaru;
        cars[1] = mazda;
        cars[2] = nissan;
        cars[3] = suzuki;
        cars[4] = audi;

        Arrays.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
