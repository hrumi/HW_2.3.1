package web.model;

public class Car {
    private String brand;
    private String year;
    private String color;

    public Car() {
    }

    public Car(String brand, String year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " + brand + " from " + year;
    }
}
