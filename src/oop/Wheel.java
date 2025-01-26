package oop;

public class Wheel {
    private String manufacturer;
    private int rim;
    private double width;

    public Wheel(String manufacturer, int rim, double width) {
        this.manufacturer = manufacturer;
        this.rim = rim;
        this.width = width;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRim() {
        return rim;
    }

    public double getWidth() {
        return width;
    }
}
