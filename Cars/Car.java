package Cars;

import java.util.Objects;

public abstract class Car {
    private String carID;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double mileage;
    private double price;
    private CarStatus status; // Status of the car

    public Car(String carID, String brand, String model, int year, String color, double mileage, double price, CarStatus status) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
        this.status = CarStatus.AVAILABLE; // Initialize as available
    }

    // Getters
    public String getCarId() { return carID; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public double getMileage() { return mileage; }
    public double getPrice() { return price; }
    public CarStatus getStatus() { return status; }

    // Set the car status
    public void setStatus(CarStatus status) { this.status = status; }

    public abstract String displayCarDetails();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return carID.equals(car.carID) &&
               brand.equalsIgnoreCase(car.brand) &&
               model.equalsIgnoreCase(car.model) &&
               year == car.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carID, brand, model, year);
    }
}
