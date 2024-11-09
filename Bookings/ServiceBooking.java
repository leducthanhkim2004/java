package Bookings;

public class ServiceBooking extends Booking {
    private String serviceType;      // Type of service (e.g., "Oil Change", "Tire Rotation")
    private int serviceQuantity;     // Quantity
    private double serviceRate;      // Rate per hour for the service

    public ServiceBooking(String bookingID, String customerID, String carID, BookingStatus bookingStatus, String serviceType, int serviceQuantity, double serviceRate, PaymentType paymentType) {
        super(bookingID, customerID, carID, bookingStatus, paymentType);
        this.serviceType = serviceType;
        this.serviceQuantity = serviceQuantity;
        this.serviceRate = serviceRate;
    }

    @Override
    public double getTotalPrice() {
        return serviceQuantity * serviceRate; // Total cost based on duration and rate
    }

    @Override
    public String displayBookingDetails() {
        return String.format("%-25s %-7d $%-10.2f  $%.2f", 
               serviceType, serviceQuantity, serviceRate, getTotalPrice());
    }

    // Getter methods for service-related attributes
    public String getServiceType() {
        return serviceType;
    }

    public int getServiceDuration() {
        return serviceQuantity;
    }

    public double getServiceRate() {
        return serviceRate;
    }
    
        // Setter for Service Type (e.g., the type of service being performed)
    public void setServiceType(String newServiceType) {
        this.serviceType = newServiceType;
    }

    // Setter for Quantity (e.g., the number of services to be performed)
    public void setQuantity(int newServiceQuantity) {
        this.serviceQuantity = newServiceQuantity;
    }

    // Setter for Service Cost (e.g., the cost of the service)
    public void setServiceCost(double newServiceRate) {
        this.serviceRate = newServiceRate;
    }

}
