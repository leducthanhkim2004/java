//package Users;
//
//import Cars.Car;            // Import the Car class
//import Cars.LuxuryCar;      // Import the LuxuryCar class
//import Cars.ElectricCar;    // Import the ElectricCar class
//import Cars.SportCar;       // Import the SportCar class
//
//import Records.CarRecord;   // Import the CarRecord class
//
//public class Customer extends User {
//    private String licenseNumber;
//    private CarRecord carRecord; // Reference to CarRecord
//
//    // Constructor for Customer
//    public Customer(String userID, String userName, String role, String contactNumber, String status, String licenseNumber) {
//        super(userID, userName, role, contactNumber, status); // Call the parent class constructor
//        this.licenseNumber = licenseNumber;
//    }
//
//    // Method to set the CarRecord
//    public void setCarRecord(CarRecord carRecord) {
//        System.out.println("The customer " + getUserName() + " is shopping...");
//        this.carRecord = carRecord; // Set the CarRecord instance
//    }
//
//    // Method to view all cars
//    public void viewAllCars() 
//    {
//        
//        
//        if (carRecord != null)
//        {
//            carRecord.viewAllCars(); // Delegate the call to CarRecord
//        } 
//        else
//        {
//            System.out.println("\nCar record is not set for this customer " + getUserName() );
//        }
//    }
//
// // Method to search for a car by model name
//public void searchCar(String modelName) {
//    
//    if (carRecord == null) {
//        System.out.printf("Car record is not set for this customer: %s%n", getUserName());
//        return;
//    } else {
//        System.out.println("\nThe car that customer " + getUserName() + " has been searching for:\n");
//    }
//
//    // Variable to hold the found car
//    Car foundCar = null;
//
//    // Iterate through the list of cars to find a match
//    for (Car car : carRecord.getCars()) {
//        if (car != null && car.getModel().equalsIgnoreCase(modelName)) {
//            foundCar = car; // Set found car
//            break; // Exit the loop once the car is found
//        }
//    }
//
//    // Check if the car was found and print details
//    if (foundCar != null) {
//        printCarDetails(foundCar);
//    } else {
//        System.out.printf("No car found with the model name: %s%n", modelName);
//    }
//}
//
//
//    // Method to print car details based on car type
//    private void printCarDetails(Car car) {
//        
//        if (car instanceof ElectricCar) {
//            ElectricCar electricCar = (ElectricCar) car;
//            System.out.printf("Car ID: %s, Brand: %s, Model: %s, Year: %d, Color: %s, Mileage: %.2f, Price: %.2f, Range: %.2f km, Battery Capacity: %.2f kWh%n",
//                    electricCar.getCarId(), 
//                    electricCar.getBrand(), 
//                    electricCar.getModel(), 
//                    electricCar.getYear(), 
//                    electricCar.getColor(), 
//                    electricCar.getMileage(), 
//                    electricCar.getPrice(), 
//                    electricCar.getRange(), 
//                    electricCar.getBatteryCapacity());
//        } 
//        else if (car instanceof SportCar) 
//        {
//            SportCar sportCar = (SportCar) car;
//            
//            System.out.printf("Car ID: %s, Brand: %s, Model: %s, Year: %d, Color: %s, Mileage: %.2f, Price: %.2f, Top Speed: %.2f km/h, Acceleration: %.2f seconds (0-100 km/h)%n",
//                    sportCar.getCarId(), 
//                    sportCar.getBrand(), 
//                    sportCar.getModel(), 
//                    sportCar.getYear(), 
//                    sportCar.getColor(), 
//                    sportCar.getMileage(), 
//                    sportCar.getPrice(), 
//                    sportCar.getTopSpeed(), 
//                    sportCar.getAcceleration());
//            
//            System.out.printf("\n");
//            
//        } 
//        else if (car instanceof LuxuryCar) 
//        {
//            LuxuryCar luxuryCar = (LuxuryCar) car;
//            System.out.printf("Car ID: %s, Brand: %s, Model: %s, Year: %d, Color: %s, Mileage: %.2f, Price: %.2f, Luxury Package: %s%n",
//                    luxuryCar.getCarId(), 
//                    luxuryCar.getBrand(), 
//                    luxuryCar.getModel(), 
//                    luxuryCar.getYear(), 
//                    luxuryCar.getColor(), 
//                    luxuryCar.getMileage(), 
//                    luxuryCar.getPrice(), 
//                    luxuryCar.getLuxuryPackage());
//            
//            System.out.printf("\n");
//        } 
//        else
//        {
//            // Generic Car details if not a specific type
//            System.out.printf("Car ID: %s, Brand: %s, Model: %s, Year: %d, Color: %s, Mileage: %.2f, Price: %.2f%n",
//                    car.getCarId(), 
//                    car.getBrand(), 
//                    car.getModel(), 
//                    car.getYear(), 
//                    car.getColor(), 
//                    car.getMileage(), 
//                    car.getPrice());
//            
//            System.out.printf("\n");
//        }
//    }
//
//    // Getter for license number
//    public String getLicense() {
//        return licenseNumber;
//    }
//}
