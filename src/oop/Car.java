package oop;

public class Car implements Comparable<Car> {

    private int id;
    private String manufacturer;
    private String model;
    private Color color = Color.DARK_GRAY;
    private Engine engine;
    private FuelTank fuelTank;
    private Person driver;
    private Wheel[] wheels;
    private int wheelsIndex;

    private CarType carType;

    private static Color patentColor = Color.ORANGE;
    private static int staticFuelTankCapacity = 30;
    private static int lastId;

    public static final Integer MAX_SPEED_ROAD = 120;
    public static final int MAX_SPEED_CITY = 60;

    public static final String COLOR_RED = "Red";
    public static final String COLOR_YELLOW = "Yellow";
    public static final String COLOR_BLUE = "Blue";
    public static final String COLOR_WHITE = "White";
    public static final String COLOR_GRAY = "Dark Gray";

    public Car() {
        this.id = ++lastId;
        this.wheels = new Wheel[5];
    }

    public Car(String manufacturer, String model) {
        this();
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(String manufacturer, String model, Color color){
        this(manufacturer, model);
        this.color = color;
    }

    public Car(String manufacturer, String model, Color color, Engine engine) {
        this(manufacturer, model, color);
        this.engine = engine;
    }

    public Car(String manufacturer, String model, Color color, Engine engine, FuelTank fuelTank) {
        this(manufacturer, model, color, engine);
        this.fuelTank = fuelTank;
    }

    public Car(String manufacturer, String model, Color color, Engine engine, FuelTank fuelTank, Person driver, Wheel[] wheels) {
        this(manufacturer, model, color, engine, fuelTank);
        this.driver = driver;
        this.wheels = wheels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getPatentColor(){
        return patentColor;
    }

    public static void setPatentColor(Color patentColor){
        Car.patentColor = patentColor;
    }

    public static int getStaticFuelTankCapacity() {
        return staticFuelTankCapacity;
    }

    public static void setStaticFuelTankCapacity(int staticFuelTankCapacity) {
        Car.staticFuelTankCapacity = staticFuelTankCapacity;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public FuelTank getFuelTank() {
        if(fuelTank == null){
            this.fuelTank = new FuelTank();
        }
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Car addWheel(Wheel wheel){
        if(wheelsIndex < this.wheels.length) {
            this.wheels[wheelsIndex++] = wheel;
        }
        return this;
    }

    public String viewDetail() {
        String detail = "car.id = " + this.id +
                "\ncar.manufacturer = " + this.getManufacturer() +
                "\ncar.model = " + this.getModel();

        if(this.getCarType() != null) {
            detail += "\ncar.type = " + this.getCarType().getDescription();
        }

        detail += "\ncar.color = " + this.color +
                "\ncar.patentColor = " + patentColor;

        if(this.engine != null) {
            detail += "\ncar.engineCapacity = " + this.engine.getDisplacement();
        }

        if(driver != null) {
            detail += "\ndriver: " + this.getDriver();
        }

        if(getWheels() != null) {
            detail += "\nCar wheels:";
            for (Wheel r : this.getWheels()) {
                detail += "\n" + r.getManufacturer() + ", rim: " + r.getRim() + ", width: " + r.getWidth();
            }
        }

        return detail;
    }

    public String accelerate(int rpm) {
        return "the car " + this.manufacturer + " accelerating at " + rpm + "rpm";
    }

    public String brake() {
        return this.manufacturer + " " + this.model + " braking!";
    }

    public String accelerateBrake(int rpm) {
        String accelerate = this.accelerate(rpm);
        String brake = this.brake();
        return accelerate + "\n" + brake;
    }

    public float calculateFuelConsumption(int km, float fuelPercentage) {
        return km / (this.getFuelTank().getCapacity() * fuelPercentage);
    }

    public float calculateFuelConsumption(int km, int fuelPercentage) {
        return km / (this.getFuelTank().getCapacity() * (fuelPercentage / 100f));
    }

    public static float calculateStaticFuelConsumption(int km, int fuelPercentage) {
        return km / (Car.staticFuelTankCapacity * (fuelPercentage / 100f));
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(!(obj instanceof Car)){
            return false;
        }
        Car car = (Car) obj;
        return (this.manufacturer != null && this.model != null
                && this.manufacturer.equals(car.getManufacturer())
                && this.model.equals(car.getModel()));
    }

    @Override
    public String toString() {
        return this.id + " : " + manufacturer + " " + model;
    }

    @Override
    public int compareTo(Car car) {
        return this.manufacturer.compareTo(car.manufacturer);
    }
}
