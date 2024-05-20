package LESSON7ACTIVITY;

public class cars {
    // Private attributes
    private String brand;
    private String model;
    private int year;

    cars() {}

    // Constructor
    public cars(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
