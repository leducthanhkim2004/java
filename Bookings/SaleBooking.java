package Bookings;

public class SaleBooking extends Booking {
    private String saleItem;         // Item being sold (e.g., "Extended Warranty", "Accessories")
    private int itemQuantity;        // Quantity of the item
    private double itemPrice;        // Price per item

    public SaleBooking(String bookingID, String customerID, String carID, String bookingStatus, String saleItem, int itemQuantity, double itemPrice, String payment) {
        super(bookingID, customerID, carID, bookingStatus, payment);
        this.saleItem = saleItem;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    @Override
    public double getTotalPrice() {
        return itemQuantity * itemPrice; // Total cost based on quantity and item price
    }

    @Override
    public String displayBookingDetails() {
        return String.format("%-15s      %d       $%.2f          $%.2f\n", 
                            saleItem, itemQuantity, itemPrice, getTotalPrice());
    }

    // Getter methods for sale-related attributes
    public String getSaleItem() {
        return saleItem;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}

