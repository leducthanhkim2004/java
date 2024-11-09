package Records;
 
import Cars.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CarRecord implements Record<Car> {
    
    private final List<Car> carRecords; // Use List for flexibility and declare as final

    public CarRecord() {
        carRecords = new ArrayList<>();
    }
    
    /**
     * Adds a Car to the record.
     *
     * @param car the Car to add
     * @return true if the car was added successfully, false otherwise
     */
    @Override
    public boolean addRecord(final Car car) 
    { // Implementing the interface method
        if (car == null) 
        {
            throw new IllegalArgumentException("Car cannot be null");
        }
        return carRecords.add(car);
    }
    

    // Method to return the list of cars
    public List<Car> getCars()
    {
        return carRecords;
    }
    
    // Method to remove a car from the record only if its status is SOLD
    public void removeCarFromRecord(Car carToRemove) {
        
        if (carToRemove == null) 
        {
            System.out.println("Car to remove cannot be null.");
            return;
        }
        // Check if the car is in the record
        if (!carRecords.contains(carToRemove)) 
        {
            System.out.println("Car not found in the Car Record.");
            return;
        }
        // Check if the car's status is SOLD
        if (carToRemove.getStatus() != CarStatus.SOLD) 
        {
            System.out.println("Car cannot be removed unless its status is SOLD.");
            return;
        }

    // Proceed to remove the car
    boolean removed = carRecords.remove(carToRemove);
    if (removed) 
    {
        System.out.println("Car with ID " + carToRemove.getCarId() + " removed from Car Record.");
       
    } 
    else 
    {
        System.out.println("Failed to remove the car from Car Record.");
    }
} 
    public void setCarStatus(Car carToChange, CarStatus newStatus) {
            if (carToChange == null) {
                System.out.println("Car cannot be null.");
                return;
            }

            boolean found = false;
            for (Car car : carRecords) 
            {
                if (car.equals(carToChange)) 
                {
                    car.setStatus(newStatus); // Update the car's status
                    found = true;
                    System.out.println("Car status updated to " + newStatus + " for Car ID: " + car.getCarId() + ". Please remove it from the inventory manually." );
                    break;
                }
            }

            if (!found) {
                System.out.println("Car not found in the Car Record.");
            }
        }
            
    // Method to display the car details in a table format
    private static void printCarDetailsHeader(final String carType) 
    { // Parameter can be final to prevent reassignment
        System.out.printf("\n");
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        
        System.out.printf("%s CAR RECORD\n", carType);
        
        System.out.printf("-------------------------------------------------------------------------------------------------------\n");
        
        // Common headers can be printed here; customize for each type if necessary
        System.out.printf("%-10s %-15s %-15s %-5s %-10s %-10s %-15s %-25s %s%n", 
        "Car ID", "Brand", "Model", "Year", "Color", "Mileage", "Price", "Additional Info", "Status");
    }
    
    private static void displayCarDetails(final Car car) { // Parameter can be final to prevent reassignment
    // Get additional details from the car's subclass
        String additionalInfo = car.displayCarDetails();

        // Print formatted car details including additional information and car status
        System.out.printf("%-10s %-15s %-15s %-5d %-10s %-10.2f $%-14.2f %-25s %s%n",
                car.getCarId(), 
                car.getBrand(), 
                car.getModel(),
                car.getYear(), 
                car.getColor(), 
                car.getMileage(),
                car.getPrice(), 
                additionalInfo,  // Corrected: Use the variable here instead of calling the method again
                car.getStatus());  // Corrected: Use car.getStatus() instead of car.CarStatus.AVAILABLE
    }


    // Method to view all car records
    public final void viewAllCars() { // Marking this method as final
        
        if (carRecords.isEmpty()) 
        {
            System.out.println("No cars in the record.");
            return;
        }

        Set<String> printedHeaders = new HashSet<>(); // Set to track printed headers

        // Iterate through the car records
        for (Car car : carRecords)
        {
            String carType = car instanceof SportCar ? "SPORT" :
                             car instanceof LuxuryCar ? "LUXURY" :
                             car instanceof ElectricCar ? "ELECTRIC" : "GENERAL";

            // Print the header only if it hasn't been printed yet
            if (!printedHeaders.contains(carType)) 
            {
                printCarDetailsHeader(carType); // Print the header for the car type
                printedHeaders.add(carType); // Mark this header as printed
            }

            displayCarDetails(car); // Display details for the car
        }
    }
    
    /**
     * Displays all car records.
     */
    @Override
    public void viewRecords() {
        viewAllCars();
    }
}
