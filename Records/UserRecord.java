//package Records;
//
//import Users.User; // Import the User class
//import Users.Customer; // Import the Customer class
//import Users.Admin; // Import the Admin class
//import Users.HRManager; // Import the HRManager class
//import Users.CarInventoryManager; // Import the CarInventoryManager class
//import Users.Employee.Employee; // Import the Employee class from the sub-package
//import Users.Employee.SalesRepresentative; // Import the SalesRepresentative class
//import Users.Employee.ServiceTechnician; // Import the ServiceTechnician class
//
//import java.util.ArrayList;
//
//public class UserRecord<T extends User> implements Record<T> {
//    private final ArrayList<T> userRecords; // List to hold user records
//
//    // Constructor to initialize the user records list
//    public UserRecord() {
//        userRecords = new ArrayList<>();
//    }
//
//    // Method to add a User
//    @Override
//    public boolean addRecord(T user) {
//        if (user == null) {
//            System.out.println("Cannot add null user.");
//            return false; // Avoid null values
//        }
//        if (!userExists(user)) { // Check for duplicates
//            userRecords.add(user);
//            return true;
//        } else {
//            System.out.println("User already exists in the record.");
//            return false;
//        }
//    }
//    
//     @Override
//    public void viewAllRecords() {
//        if (userRecords.isEmpty()) {
//            System.out.println("No users in the record.");
//            return;
//        }
//        // Print the header for all users
//        printUserDetailsHeader("USER");
//        // Iterate through the user records and display each user's details
//        for (T user : userRecords) {
//            formatUserDetails(user);
//        }
//    }
//
//    // Method to check if a user exists in the record
//    public boolean userExists(T user) {
//        return userRecords.contains(user);
//    }
//
//    // Method to print the user details header
//    private void printUserDetailsHeader(String role) {
//        System.out.printf("\n");
//        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
//        System.out.printf("%s RECORDS\n", role.toUpperCase());
//        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
//        System.out.printf("%-10s %-15s %-15s %-15s %-10s%n", 
//                          "User ID", "Name", "License Number", "Contact Number", "Status");
//        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
//    }
//
//    // Method to format user details for display
//    private void formatUserDetails(T user) {
//        System.out.printf("%-10s %-15s %-15s %-15s %-10s%n",
//                          user.getUserID(),
//                          user.getUserName(),
//                          user instanceof Customer ? ((Customer) user).getLicense() : "N/A", // Check if user is a Customer
//                          user.getContactNumber(),
//                          user.getStatus());
//    }
//
//    // Method to view all user records
//
//
//    // Helper method to display users by type
//    private void viewUsersByType(Class<?> userType, String header) {
//        boolean hasUsers = false;
//        for (T user : userRecords) {
//            if (userType.isInstance(user)) {
//                if (!hasUsers) {
//                    printUserDetailsHeader(header); // Print header only once
//                    hasUsers = true;
//                }
//                formatUserDetails(user);
//            }
//        }
//        if (!hasUsers) {
//            System.out.println("No " + header.toLowerCase() + "s in the record.");
//        }
//    }
//
//    // Refactored methods using the helper method
//    public void viewAllCustomers() {
//        viewUsersByType(Customer.class, "CUSTOMER");
//    }
//
//    public void viewAllAdmins() {
//        viewUsersByType(Admin.class, "ADMIN");
//    }
//
//    public void viewAllHRManagers() {
//        viewUsersByType(HRManager.class, "HR MANAGER");
//    }
//
//    public void viewAllCarInventoryManagers() {
//        viewUsersByType(CarInventoryManager.class, "CAR INVENTORY MANAGER");
//    }
//
//    public void viewAllEmployees() {
//        viewUsersByType(Employee.class, "EMPLOYEE");
//    }
//
//    public void viewAllSalesRepresentatives() {
//        viewUsersByType(SalesRepresentative.class, "SALES REPRESENTATIVE");
//    }
//
//    public void viewAllServiceTechnicians() {
//        viewUsersByType(ServiceTechnician.class, "SERVICE TECHNICIAN");
//    }
//}
