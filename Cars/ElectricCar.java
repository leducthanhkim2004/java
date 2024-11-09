package Cars;

public class ElectricCar extends Car {
    private double range; // in km
    private double batteryCapacity; // in kWh

    public ElectricCar(String carID, String brand, String model, int year, String color, double mileage, double price, double range, double batteryCapacity, CarStatus status) {
        super(carID, brand, model, year, color, mileage, price, status);
        this.range = range;
        this.batteryCapacity = batteryCapacity;
    }

    public double getRange() {
        return range;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String displayCarDetails() {
        return String.format("%.2f miles|%.2f kWh", range, batteryCapacity);
    }
    
    @Override
    public String toString() {
        return "Electric"; // Return just the type name
    }
}

