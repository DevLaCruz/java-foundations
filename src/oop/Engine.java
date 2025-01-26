package oop;

public class Engine {
    private double displacement;
    private EngineType type;

    public Engine() {
    }

    public Engine(double displacement, EngineType type) {
        this.displacement = displacement;
        this.type = type;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }
}
