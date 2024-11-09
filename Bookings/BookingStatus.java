package Bookings;

public enum BookingStatus {
    PENDING("Pending"),
    CONFIRMED("Confirmed"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

    private String bookingStatus;

    // Constructor for setting the description of each status
    BookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    // Method to get the description of the status
    public String getbookingStatus() {
        return bookingStatus;
    }
}

