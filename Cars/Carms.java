package Cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Bookings.*;

import Records.*;
//import Records.UserRecord;



//import Users.Customer;
//import Users.CarInventoryManager;
import Users.Admin;
import Users.User;
        
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
        
public class Carms {
    public static void main(String[] args) {
/* ---------------------------------------------------------------------------*/
        
        // Create instances of electric cars
        ElectricCar electricCar1  = new ElectricCar("CAR006", "Tesla"  , "Model S"          , 2024, "Red"   , 300.0, 95000.0 , 652 , 100,   CarStatus.AVAILABLE);
        ElectricCar electricCar2  = new ElectricCar("CAR007", "Nissan" , "Leaf"             , 2023, "Blue"  , 250.0, 35000.0 , 364 , 62,    CarStatus.AVAILABLE);
        ElectricCar electricCar3  = new ElectricCar("CAR008", "Ford"   , "Mustang Mach-E"   , 2024, "Yellow", 310.0, 65000.0 , 483 , 88,    CarStatus.AVAILABLE);
        ElectricCar electricCar4  = new ElectricCar("CAR009", "BMW"    , "i4"               , 2024, "White" , 290.0, 55000.0 , 483 , 83,    CarStatus.AVAILABLE);
        ElectricCar electricCar5  = new ElectricCar("CAR003", "VinFast", "VF e34"           , 2024, "Black" , 300.0, 35000.0 , 420 , 285.0, CarStatus.AVAILABLE);
  

/* ---------------------------------------------------------------------------*/

        // Create instances of luxury cars
        LuxuryCar luxuryCar1  = new LuxuryCar("CAR001" , "Mercedes-Benz"    , "S-Class"  , 2024, "Black" , 500.0 , 150000.0 ,  "AMG Package"            ,CarStatus.AVAILABLE );
        LuxuryCar luxuryCar2  = new LuxuryCar("CAR002" , "BMW"              , "7 Series" , 2024, "White" , 480.0 , 140000.0 ,  "Luxury Seating"         ,CarStatus.AVAILABLE);
        LuxuryCar luxuryCar3  = new LuxuryCar("CAR003" , "Audi"             , "A8"       , 2023, "Gray"  , 450.0 , 130000.0 ,  "Executive Package"      ,CarStatus.AVAILABLE);
        LuxuryCar luxuryCar4  = new LuxuryCar("CAR004" , "Lexus"            , "LS"       , 2024, "Blue"  , 470.0 , 125000.0 ,  "Premium Package"        ,CarStatus.AVAILABLE);
        LuxuryCar luxuryCar5  = new LuxuryCar("CAR005" , "Jaguar"           , "XJ"       , 2023, "Silver", 460.0 , 135000.0 ,  "Luxury Sports Package"  ,CarStatus.AVAILABLE);
        

/* ---------------------------------------------------------------------------*/

        // Create instances of sport cars
        SportCar sportCar1  = new SportCar("CAR011", "Porsche"    , "911"                 , 2024, "Red"   , 200.0, 120000.0, 320.0, 3.5,CarStatus.AVAILABLE);
        SportCar sportCar2  = new SportCar("CAR012", "Ferrari"    , "488 GTB"             , 2024, "Yellow", 150.0, 250000.0, 330.0, 3.0,CarStatus.AVAILABLE);
        SportCar sportCar3  = new SportCar("CAR013", "Lamborghini", "Huracan"             , 2023, "Green" , 180.0, 240000.0, 325.0, 3.2,CarStatus.AVAILABLE);
        SportCar sportCar4  = new SportCar("CAR014", "Chevrolet"  , "Corvette"            , 2024, "Blue"  , 220.0, 80000.0 , 310.0, 2.9,CarStatus.AVAILABLE);
        SportCar sportCar5  = new SportCar("CAR031", "Audi"       , "R8"                  , 2023, "Black" , 210.0, 180000.0, 330.0, 3.2,CarStatus.AVAILABLE);
        
 

/* ---------------------------------------------------------------------------*/

        // Create a CarRecord instance
        CarRecord carRecord = new CarRecord();

        // Add cars to the CarRecord
        carRecord.addRecord(electricCar1);
        carRecord.addRecord(electricCar2);
        carRecord.addRecord(electricCar3);
        carRecord.addRecord(electricCar4);
        carRecord.addRecord(electricCar5);

        
        System.out.printf("\n");
     
        // View all car records
        carRecord.viewAllCars();
        
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        
        System.out.printf("\n");
           
/* ---------------------------------------------------------------------------*/

        CarRecord carRecord2 = new CarRecord();
        
        // Add cars to the CarRecord
        carRecord2.addRecord(luxuryCar1);
        carRecord2.addRecord(luxuryCar2);
        carRecord2.addRecord(luxuryCar3);
        carRecord2.addRecord(luxuryCar4);
        carRecord2.addRecord(luxuryCar5);
        
        
        System.out.printf("\n");

        // View all car records
        carRecord2.viewAllCars();
        
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        System.out.printf("\n");
        
/* ---------------------------------------------------------------------------*/

        CarRecord carRecord3 = new CarRecord();
        
        // Add cars to the CarRecord
        carRecord3.addRecord(sportCar1);
        carRecord3.addRecord(sportCar2);
        carRecord3.addRecord(sportCar3);
        carRecord3.addRecord(sportCar4);
        carRecord3.addRecord(sportCar5);

        
        System.out.printf("\n");
        
        // View all car records
        carRecord3.viewAllCars();
        
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        System.out.printf("\n");

/* ---------------------------------------------------------------------------*/

        System.out.printf("\n");

/* ---------------------------------------------------------------------------*/
       
        // Declare luxury car inventory objects 
        Inventory luxuryInventory = new Inventory("LUX", 20, carRecord2);

        // Add cars to their respective inventories
        luxuryInventory.addItem(luxuryCar1);
        luxuryInventory.addItem(luxuryCar2);
        luxuryInventory.addItem(luxuryCar3);
        luxuryInventory.addItem(luxuryCar4);
        luxuryInventory.addItem(luxuryCar5); 

        // Create an InventoryRecord for luxury cars
        InventoryRecord luxuryInventoryRecord = new InventoryRecord(luxuryInventory);

        // Print inventory details header for luxury cars
        luxuryInventoryRecord.printInventoryDetailsHeader("Luxury");

        // Display inventory details
        luxuryInventoryRecord.displayInventoryDetails();

        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        
        System.out.printf("\n");
        
/* ---------------------------------------------------------------------------*/


/* ---------------------------------------------------------------------------*/
      
        Inventory sportInventory = new Inventory("SPT", 20, carRecord3);
        
        // Add cars to their respective inventories
        sportInventory.addItem(sportCar1);
        sportInventory.addItem(sportCar2);
        sportInventory.addItem(sportCar3);
        sportInventory.addItem(sportCar4);
        sportInventory.addItem(sportCar5);

//        sportInventory.removeCarFromInventory(sportCar5);
//        sportInventory.removeCarFromInventory(sportCar4);
        
        // Create an InventoryRecord for luxury cars
        InventoryRecord sportInventoryRecord = new InventoryRecord(sportInventory);

        // Print inventory details header for luxury cars
        sportInventoryRecord.printInventoryDetailsHeader("Sport");

        // Display inventory details
        sportInventoryRecord.displayInventoryDetails();
        
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        
        System.out.printf("\n");
        
/* ---------------------------------------------------------------------------*/


/* ---------------------------------------------------------------------------*/
        
        Inventory electricInventory = new Inventory("ELE", 20, carRecord);
        
        // Add cars to their respective inventories
        electricInventory.addItem(electricCar1);
        electricInventory.addItem(electricCar2);
        electricInventory.addItem(electricCar3);
        electricInventory.addItem(electricCar4);
        electricInventory.addItem(electricCar5);
   

        // Create an InventoryRecord for luxury cars
        InventoryRecord electricInventoryRecord = new InventoryRecord(electricInventory);

        // Print inventory details header for luxury cars
        electricInventoryRecord.printInventoryDetailsHeader("Electric");

        // Display inventory details
        electricInventoryRecord.displayInventoryDetails();
        
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        System.out.printf("\n");
        
/* ---------------------------------------------------------------------------*/
        carRecord3.viewAllCars();
        
        
        System.out.printf("\n");

/* ---------------------------------------------------------------------------*/
        
// Create an instance of BookingRecord
        BookingRecord bookingRecord = new BookingRecord();

        // Create and add ServiceBookings
        ServiceBooking serviceBooking1 = new ServiceBooking("S001", "CUST001", "CAR001", BookingStatus.COMPLETED, "Oil Change"               , 1, 50.0 , PaymentType.CASH);
        ServiceBooking serviceBooking2 = new ServiceBooking("S002", "CUST002", "CAR002", BookingStatus.PENDING  , "Tire Rotation"            , 4, 30.0 , PaymentType.BANK_TRANSFER);
        ServiceBooking serviceBooking3 = new ServiceBooking("S003", "CUST003", "CAR003", BookingStatus.CANCELLED, "Brake Inspection"         , 2, 80.0 , PaymentType.CASH);
        ServiceBooking serviceBooking4 = new ServiceBooking("S004", "CUST004", "CAR004", BookingStatus.COMPLETED, "Engine Diagnostics"       , 3, 120.0, PaymentType.CREDIT_CARD);
        ServiceBooking serviceBooking5 = new ServiceBooking("S005", "CUST005", "CAR005", BookingStatus.PENDING  , "Transmission Fluid Change", 5, 150.0, PaymentType.CREDIT_CARD);


        bookingRecord.addRecord(serviceBooking1);
        bookingRecord.addRecord(serviceBooking2);
        bookingRecord.addRecord(serviceBooking3);
        bookingRecord.addRecord(serviceBooking4);
        bookingRecord.addRecord(serviceBooking5);
        

        // Create and add SaleBookings with supplies of the car
        SuppliesBooking suppliesBooking1 = new SuppliesBooking("B001", "CUST003", "CAR003", BookingStatus.COMPLETED, "Leather Seats", 1, 20000.0, PaymentType.CREDIT_CARD);
        SuppliesBooking suppliesBooking2 = new SuppliesBooking("B002", "CUST004", "CAR004", BookingStatus.PENDING, "Sunroof", 1, 22000.0, PaymentType.CASH);
        SuppliesBooking suppliesBooking3 = new SuppliesBooking("B003", "CUST005", "CAR005", BookingStatus.COMPLETED, "GPS System", 1, 25000.0, PaymentType.BANK_TRANSFER);
        SuppliesBooking suppliesBooking4 = new SuppliesBooking("B004", "CUST006", "CAR006", BookingStatus.PENDING, "Heated Seats", 1, 27000.0, PaymentType.BANK_TRANSFER);
        SuppliesBooking suppliesBooking5 = new SuppliesBooking("B005", "CUST007", "CAR007", BookingStatus.COMPLETED, "Alloy Wheels", 1, 28000.0, PaymentType.CREDIT_CARD);


        bookingRecord.addRecord(suppliesBooking1);
        bookingRecord.addRecord(suppliesBooking2);
        bookingRecord.addRecord(suppliesBooking3);
        bookingRecord.addRecord(suppliesBooking4);
        bookingRecord.addRecord(suppliesBooking5);  
        
        // Create and add CarSaleBookings with car brands 
        CarSaleBooking carSaleBooking1 = new CarSaleBooking("CS001", "CUST005", "CAR005", BookingStatus.COMPLETED, "Tesla Model 3", 45000.0, 3000.0, PaymentType.CASH);
        CarSaleBooking carSaleBooking2 = new CarSaleBooking("CS002", "CUST006", "CAR006", BookingStatus.PENDING, "BMW 3 Series", 40000.0, 4000.0, PaymentType.BANK_TRANSFER);
        CarSaleBooking carSaleBooking3 = new CarSaleBooking("CS003", "CUST007", "CAR007", BookingStatus.COMPLETED, "Audi A4", 50000.0, 3500.0, PaymentType.CREDIT_CARD);
        CarSaleBooking carSaleBooking4 = new CarSaleBooking("CS004", "CUST008", "CAR008", BookingStatus.PENDING, "Mercedes Benz C-Class", 42000.0, 2500.0, PaymentType.BANK_TRANSFER);
        CarSaleBooking carSaleBooking5 = new CarSaleBooking("CS005", "CUST009", "CAR009", BookingStatus.COMPLETED, "Lexus RX", 47000.0, 3000.0, PaymentType.CASH);

        bookingRecord.addRecord(carSaleBooking1);
        bookingRecord.addRecord(carSaleBooking2);
        bookingRecord.addRecord(carSaleBooking3);
        bookingRecord.addRecord(carSaleBooking4);
        bookingRecord.addRecord(carSaleBooking5);
        
        
        // View all service bookings
       
        bookingRecord.viewRecords("SERVICE");

        // View all sale bookings
 
        bookingRecord.viewRecords("SUPPLIES");

        // View all car sale bookings
        
        bookingRecord.viewRecords("CAR SALE");
        
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        System.out.printf("\n");
        
/* ---------------------------------------------------------------------------*/

/* ---------------------------------------------------------------------------*/
//        
//        // Create an instance of UserRecord
//        UserRecord userRecord = new UserRecord();
//
//        // Create Customer instances
//        Customer customer1 = new Customer("CUS123", "John Doe", "Customer", "555-123400", "Active", "ABC123456");
//        Customer customer2 = new Customer("CUS456", "Jane Smith", "Customer", "555-567008", "Inactive", "XYZ789101");
//        Customer customer3 = new Customer("CUS789", "Mike Johnson", "Customer", "555-910001", "Active", "LMN456789");
//        Customer customer4 = new Customer("CUS234", "Emily Davis", "Customer", "555-234567", "Active", "EMD987654");
//        Customer customer5 = new Customer("CUS567", "Chris Brown", "Customer", "555-345678", "Inactive", "CHR123890");
//        
//
//
//        // Add customers to the user record
//        userRecord.addCustomer(customer1);
//        userRecord.addCustomer(customer2);
//        userRecord.addCustomer(customer3);
//        userRecord.addCustomer(customer4);
//        userRecord.addCustomer(customer5);
//
//        
//        userRecord.viewAllCustomers();
//        
//        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
//        System.out.printf("\n");
                
/* ---------------------------------------------------------------------------*/

        System.out.printf("\n");

/* ---------------------------------------------------------------------------*/
//    
//    // Scenario 1: Set CarRecord
//   
//    customer1.setCarRecord(carRecord);
//
//    // Scenario 2: Search for a car
//    customer1.searchCar("i4");
//    customer1.searchCar("Leaf");
//
//    // Scenario 3: Attempt to view cars without setting CarRecord
//    Customer anotherCustomer = new Customer("C002", "Jane Smith", "Regular", "0987654321", "Active", "ABC5678");
//    anotherCustomer.viewAllCars(); // Expecting: CarRecord is not set for this customer.
//    
//    System.out.printf("-------------------------------------------------------------------------------------------------------\n");
//    System.out.printf("\n");
//    
///* ---------------------------------------------------------------------------*/
//
//     System.out.printf("\n");
//
///* ---------------------------------------------------------------------------*/
////        // Create an inventory and manager instance for testing
////
////        CarInventoryManager manager1 = new CarInventoryManager(luxuryInventory, carRecord2, luxuryInventoryRecord);
////
////        // Add cars to the inventory
////        manager1.addCar(new LuxuryCar("LUX001", "BMW", "7 Series", 2021, "Black", 15000, 80000, "Premium Package"));
////        
//        CarInventoryManager manager2 = new CarInventoryManager(sportInventory, carRecord3, sportInventoryRecord);
//        manager2.addCar(new SportCar("SPT001", "Porsche", "911", 2022, "Red", 5000, 120000, 330, 3.5));
//        
//        CarInventoryManager manager3 = new CarInventoryManager(electricInventory, carRecord, electricInventoryRecord);
//        manager3.addCar(new ElectricCar("ELEC001", "Tesla", "Model S", 2023, "White", 2000, 90000, 400, 100));
//
//        // View all cars
//        manager1.viewAllCars();
//        manager2.viewAllCars();
//        manager3.viewAllCars();
//
//        // Display inventory details
//        manager1.displayInventoryDetails();
//        manager2.displayInventoryDetails();
//        manager3.displayInventoryDetails();

    }
}