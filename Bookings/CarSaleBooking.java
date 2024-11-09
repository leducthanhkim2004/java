package Bookings;

public class CarSaleBooking extends Booking {
    private String carModel;        // Model of the car being sold
    private double carPrice;        // Price of the car
    private double discount;        // Discount on the car price

    // Constructor for CarSaleBooking
    public CarSaleBooking(String bookingID, String customerID, String carID, BookingStatus bookingStatus, 
                          String carModel, double carPrice, double discount, PaymentType paymentType) {
        super(bookingID, customerID, carID, bookingStatus, paymentType);
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.discount = discount;
    }

    // Method to calculate the total price after applying the discount
    @Override
    public double getTotalPrice() {
        return carPrice - discount; // Calculate total price after discount
    }

    // Method to display booking details for the car sale
    @Override
    public String displayBookingDetails() {
        return String.format("%-22s $%.2f          $%.2f          Total: $%.2f", 
                             carModel, carPrice, discount, getTotalPrice());
    }

    // Getter methods for car sale details
    public String getCarModel() {
        return carModel;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public double getDiscount() {
        return discount;
    }
    
        // Setter for Car Brand
    public void setCarBrand(String newCarModel) {
        this.carModel = newCarModel;
    }

    // Setter for Price
    public void setPrice(double newCarPrice) {
        this.carPrice = newCarPrice;
    }

    // Setter for Discount
    public void setDiscount(double newDiscount) {
        this.discount = newDiscount;
    }

}

