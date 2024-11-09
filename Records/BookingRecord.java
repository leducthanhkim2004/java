package Records;

import Bookings.*;
import java.util.ArrayList;

/**
 * This class manages records of service bookings, supplies bookings, and car sale bookings.
 */
public class BookingRecord implements Record<Booking> {
    private ArrayList<ServiceBooking> serviceBookings; // List to hold ServiceBooking records
    private ArrayList<SuppliesBooking> suppliesBookings; // List to hold SuppliesBooking records
    private ArrayList<CarSaleBooking> carSaleBookings; // List to hold CarSaleBooking records

    /**
     * Constructor to initialize the booking records.
     */
    public BookingRecord() {
        serviceBookings = new ArrayList<>();
        suppliesBookings = new ArrayList<>();
        carSaleBookings = new ArrayList<>();
    }

    /**
     * Adds a record to the appropriate collection based on the booking type.
     *
     * @param record the booking record to add
     * @return true if the record was added successfully, false otherwise
     */
    @Override
    public boolean addRecord(Booking record) {
        if (record == null) {
            throw new IllegalArgumentException("Booking cannot be null");
        }

        if (record instanceof ServiceBooking) {
            serviceBookings.add((ServiceBooking) record);
        } else if (record instanceof SuppliesBooking) {
            suppliesBookings.add((SuppliesBooking) record);
        } else if (record instanceof CarSaleBooking) {
            carSaleBookings.add((CarSaleBooking) record);
        } else {
            return false; // Unknown booking type
        }
        return true; // Successfully added
    }
    
    public boolean deleteRecord(ServiceBooking serviceBooking) {
    if (serviceBooking.getBookingStatus() == BookingStatus.COMPLETED || serviceBooking.getBookingStatus() == BookingStatus.CANCELLED) {
        return serviceBookings.remove(serviceBooking);
    } else {
        System.out.println("Cannot delete service booking. Status must be COMPLETED or CANCELLED.");
        return false;
    }
}

    public boolean deleteRecord(SuppliesBooking suppliesBooking) {
        if (suppliesBooking.getBookingStatus() == BookingStatus.COMPLETED || suppliesBooking.getBookingStatus() == BookingStatus.CANCELLED) {
            return suppliesBookings.remove(suppliesBooking);
        } else {
            System.out.println("Cannot delete supplies booking. Status must be COMPLETED or CANCELLED.");
            return false;
        }
    }

    public boolean deleteRecord(CarSaleBooking carSaleBooking) {
        if (carSaleBooking.getBookingStatus() == BookingStatus.COMPLETED || carSaleBooking.getBookingStatus() == BookingStatus.CANCELLED) {
            return carSaleBookings.remove(carSaleBooking);
        } else {
            System.out.println("Cannot delete car sale booking. Status must be COMPLETED or CANCELLED.");
            return false;
        }
    }
    
    public boolean updateRecord(CarSaleBooking carSaleBooking, BookingStatus newBookingStatus, PaymentType newPaymentType) {
        carSaleBooking.setBookingStatus(newBookingStatus);
        carSaleBooking.setPaymentType(newPaymentType);
        return true;
    }
    public boolean updateRecord(CarSaleBooking carSaleBooking,String newCarModel, double newCarPrice, double newDiscount) {
        carSaleBooking.setCarBrand(newCarModel);
        carSaleBooking.setPrice(newCarPrice);
        carSaleBooking.setDiscount(newDiscount);
        return true;
    }

    public boolean updateRecord(SuppliesBooking suppliesBooking, BookingStatus newBookingStatus, PaymentType newPaymentType) {
        suppliesBooking.setBookingStatus(newBookingStatus);
        suppliesBooking.setPaymentType(newPaymentType);
        return true;
    }
    
    public boolean updateRecord(SuppliesBooking suppliesBooking, String NewSaleItem, int NewQuantity) {
        suppliesBooking.setSaleItem(NewSaleItem);
        suppliesBooking.setQuantity(NewQuantity);
        return true;
    }
    
    public boolean updateRecord(ServiceBooking serviceBooking, BookingStatus newBookingStatus, PaymentType newPaymentType) {
        serviceBooking.setBookingStatus(newBookingStatus);
        serviceBooking.setPaymentType(newPaymentType);
        return true;
    }

    public boolean updateRecord(ServiceBooking serviceBooking, String newServiceType, int newQuantity, double newServiceRate) {
        serviceBooking.setServiceType(newServiceType);
        serviceBooking.setQuantity(newQuantity);
        serviceBooking.setServiceCost(newServiceRate);
        return true;
    }


    /**
     * Displays records based on the booking type.
     *
     * @param bookingType the type of bookings to view ("SERVICE", "SUPPLIES", or "CAR SALE")
     */
    public void viewRecords(String bookingType) {
        switch (bookingType.toUpperCase()) {
            case "SERVICE":
                if (serviceBookings.isEmpty()) {
                    System.out.println("No service bookings available.");
                    return;
                }
                printBookingHeader("SERVICE");
                System.out.printf("%-10s %-11s %-10s %-16s %-14s %-17s %-10s %-15s %s%n", 
                    "Booking ID", "Customer ID", "Car ID", "Booking Status", "Payment", "Service Type", "Quantity", "Service Rate", "Total Price");
                for (ServiceBooking serviceBooking : serviceBookings) {
                    displayBookingDetails(serviceBooking);
                }
                break;

            case "SUPPLIES":
                if (suppliesBookings.isEmpty()) {
                    System.out.println("No supplies bookings available.");
                    return;
                }
                printBookingHeader("SUPPLIES");
                System.out.printf("%-10s %-11s %-10s %-16s %-14s %-17s %-10s %-18s %s%n", 
                    "Booking ID", "Customer ID", "Car ID", "Booking Status", "Payment", "Supplies Type", "Quantity", "Supplies Rate", "Total Price");
                for (SuppliesBooking suppliesBooking : suppliesBookings) {
                    displayBookingDetails(suppliesBooking);
                }
                break;

            case "CAR SALE":
                if (carSaleBookings.isEmpty()) {
                    System.out.println("No car sale bookings available.");
                    return;
                }
                printBookingHeader("CAR SALE");
                System.out.printf("%-10s %-11s %-10s %-16s %-14s %-20s %-18s %-17s %s%n", 
                    "Booking ID", "Customer ID", "Car ID", "Booking Status", "Payment", "Car Brand", "Price", "Discount", "Total Price");
                for (CarSaleBooking carSaleBooking : carSaleBookings) {
                    displayBookingDetails(carSaleBooking);
                }
                break;

            default:
                System.out.println("Unknown booking type. Please specify 'SERVICE', 'SUPPLIES', or 'CAR SALE'.");
                break;
        }
    }

    /**
     * Displays all records in the collection by calling each specific type.
     */
    @Override
    public void viewRecords() {
        viewRecords("SERVICE");
        viewRecords("SUPPLIES");
        viewRecords("CAR SALE");
    }

    /**
     * Prints a header for booking records.
     * @param bookingType The type of booking (Service, Supplies, or Car Sale).
     */
    private static void printBookingHeader(String bookingType) {
        System.out.printf("\n");
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%s BOOKING RECORDS\n", bookingType);
        System.out.printf("-------------------------------------------------------------------------------------------------------\n\n");
    }

    /**
     * Displays details of a booking.
     * @param booking The Booking to display.
     */
    private static void displayBookingDetails(Booking booking) {
        System.out.printf("%-10s %-11s %-10s %-16s %-14s %s%n",
            booking.getBookingID(),
            booking.getCustomerID(),
            booking.getCarID(),
            booking.getBookingStatus(),
            booking.getPaymentType(),
            booking.displayBookingDetails());
    }
    
    
}
