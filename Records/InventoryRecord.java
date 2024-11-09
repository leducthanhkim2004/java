package Records;

import Cars.*;

/**
 * This class manages the inventory records of cars.
 */
public class InventoryRecord implements Record<Inventory> {
    private Inventory inventory;

    /**
     * Constructor to initialize the InventoryRecord with a given Inventory.
     *
     * @param inventory the inventory to manage
     */
    public InventoryRecord(Inventory inventory) {
        if (inventory == null) {
            throw new IllegalArgumentException("Inventory cannot be null");
        }
        this.inventory = inventory;
    }

    /**
     * Adds an Inventory record.
     * In this case, we won't add records to Inventory itself,
     * but we will add Cars to the Inventory.
     *
     * @param record the Inventory record (not used, as Inventory is managed directly)
     * @return true if a Car was added successfully, false otherwise
     */
    @Override
    public boolean addRecord(Inventory record) {
        throw new UnsupportedOperationException("Adding an Inventory record directly is not supported. "
                                                    + "Use inventory management methods instead.");
    }

    /**
     * Displays all cars in the inventory.
     */
    @Override
    public void viewRecords() {
        System.out.println("All Cars in Inventory:");
        displayInventoryDetails();
    }

    // Method to display inventory details
    public void displayInventoryDetails() {
        StringBuilder details = new StringBuilder();

        details.append("Inventory ID: ").append(inventory.getInventoryId())
               .append(", Capacity: ").append(inventory.getCapacity())
               .append(", Total Cars: ").append(inventory.getNumberOfCars())
               .append(", Available: ").append(inventory.getAvailableCars())
               .append(", Cars: [");

        Car[] cars = inventory.getCarArray();
        boolean first = true;

        for (Car car : cars) {
            if (car != null) {
                if (!first) {
                    details.append(", ");
                }
                details.append(car.getCarId()); // Print out Car ID
                first = false;
            }
        }
        details.append("]");

        System.out.println(details.toString());
    }

    // Method to print inventory details header
    public void printInventoryDetailsHeader(String carType) {
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%s CAR INVENTORY\n", carType.toUpperCase());
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
    }
}
