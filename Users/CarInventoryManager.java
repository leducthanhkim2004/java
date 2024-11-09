//package Users;
//
//import Cars.*;
//import Records.*;
//
//import java.util.ArrayList;
//
//public class CarInventoryManager {
//    private CarRecord carRecord;
//    private Inventory inventory;
//    private InventoryRecord inventoryRecord;
//
//    public CarInventoryManager(Inventory inventory, CarRecord carRecord, InventoryRecord inventoryRecord ) {
//        this.inventory = inventory;
//        this.carRecord = carRecord;
//        this.inventoryRecord = inventoryRecord;
//    }
//
//    // Method to add a new car to the car record
//    public void addCar(Car car) {
//        // Add to the appropriate car record based on the car type
//        if (car instanceof LuxuryCar) {
//            carRecord.addCar(car); // Add to LuxuryCar record
//            inventory.addItem(car); // Assuming Inventory has a method to add luxury cars
//        } else if (car instanceof SportCar) {
//            carRecord.addCar(car); // Add to SportCar record
//            inventory.addItem(car); // Assuming Inventory has a method to add sport cars
//        } else if (car instanceof ElectricCar) {
//            carRecord.addCar(car); // Add to ElectricCar record
//            inventory.addItem(car); // Assuming Inventory has a method to add electric cars
//        } else {
//            System.out.println("Unsupported car type: " + car.getClass().getSimpleName());
//        }
//    }
//
//
//    // Method to view all car records
//    public void viewAllCars() {
//        System.out.println("Viewing all cars in the record:");
//        carRecord.viewAllCars();
//    }
//
//    // Method to display inventory details
//    public void displayInventoryDetails() {
//        System.out.println("Displaying inventory details:");
//        inventoryRecord.displayInventoryDetails();
//    }
//
//    // Method to display inventory records
//    public void viewInventoryRecords() {
//        if (inventory != null) {
//            System.out.println("Viewing inventory records:");
//            inventoryRecord.displayInventoryDetails();
//        } else {
//            System.out.println("Inventory is not initialized.");
//        }
//    }
//}
