package Bookings;

public class SuppliesBooking extends Booking {
    private String saleItem;         // Item being sold (e.g., "Extended Warranty", "Accessories")
    private int itemQuantity;        // Quantity of the item
    private double itemPrice;        // Price per item

    public SuppliesBooking(String bookingID, String customerID, String carID, BookingStatus bookingStatus, String saleItem, int itemQuantity, double itemPrice, PaymentType paymentType) {
        super(bookingID, customerID, carID, bookingStatus, paymentType);
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
        return String.format("%-15s      %d       $%.2f          $%.2f", 
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
    
    // Setter for Sale Item (e.g., a product or service item)
    public void setSaleItem(String newSaleItem) {
        this.saleItem = newSaleItem;
    }

    // Setter for Quantity (e.g., the number of items sold)
    public void setQuantity(int newQuantity) {
        this.itemQuantity = newQuantity;
    }

}

