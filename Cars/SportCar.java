package Cars;


public class SportCar extends Car {
    private double topSpeed;
    private double acceleration; // in seconds

    public SportCar(String carID, String brand, String model, int year, String color, double mileage, double price, double topSpeed, double acceleration, CarStatus status) {
        super(carID, brand, model, year, color, mileage, price, status);
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public String displayCarDetails() {
        return String.format("%.2f km/h|%.2f sec", topSpeed, acceleration);
    }
    
    @Override
    public String toString() {
        return "Sport"; // Return just the type name
    }
}
