package Bookings;

public enum PaymentType {
    CASH("Cash"),
    CREDIT_CARD("Credit Card"),
    BANK_TRANSFER("Bank Transfer");

    private String payment;

    // Constructor
    PaymentType(String payment) {
        this.payment = payment;
    }

    // Getter for status
    public String getPayment() {
        return payment;
    }
}
