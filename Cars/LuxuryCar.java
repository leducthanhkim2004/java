package Cars;

public class LuxuryCar extends Car {
    private String luxuryPackage;

    public LuxuryCar(String carID, String brand, String model, int year, String color, double mileage, double price, String luxuryPackage, CarStatus status) {
        super(carID, brand, model, year, color, mileage, price, status);
        this.luxuryPackage = luxuryPackage;
    }

    public String getLuxuryPackage() {
        return luxuryPackage;
    }

    @Override
    public String displayCarDetails() {
        return luxuryPackage;
    }
    
    @Override
    public String toString() {
        return "Luxury"; // Return just the type name
    }
}

