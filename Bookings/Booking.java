package Bookings;

public abstract class Booking {
    private String bookingID;
    private String customerID;
    private String carID;
    private PaymentType paymentType;  // Use PaymentType instead of String
    private BookingStatus bookingStatus; // Use BookingStatus instead of String


    public Booking(String bookingID, String customerID, String carID, BookingStatus bookingStatus, PaymentType paymentType) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.carID = carID;
        this.bookingStatus = bookingStatus;
        this.paymentType = paymentType;
    }

    // Getter for PaymentType
    public PaymentType getPaymentType() {
        return paymentType;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCarID() {
        return carID;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
    
    // Setter for BookingStatus and PaymentType
    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    // Setter for PaymentType
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }


    public abstract double getTotalPrice();  // Abstract method to calculate price

    public abstract String displayBookingDetails();  // Abstract method to display booking details
}
