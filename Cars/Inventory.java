package Cars;

import Records.CarRecord;

public class Inventory {
     private final Car[] car;
    private final String inventory_id;
    int capacity;
    int available_cars;
    int number_of_car;
    private CarRecord carRecord; // Reference to CarRecord to notify when a car is removed

    public Inventory(String inventory_id, int capacity, CarRecord carRecord) {
        this.inventory_id = inventory_id;
        this.capacity = capacity;
        this.car = new Car[capacity];
        this.number_of_car = 0;
        this.available_cars = capacity - number_of_car;
        this.carRecord = carRecord; // Initialize the car record reference
    }

    public void addItem(Car car) {
        if (car == null) {
            System.out.println("Car cannot be null.");
            return;
        }

        // Check if the car's status is AVAILABLE
        if (car.getStatus() != CarStatus.AVAILABLE) {
            System.out.println("Only cars with status AVAILABLE can be added to the inventory.");
            return;
        }

        if (number_of_car >= this.capacity) {
            System.out.println("Inventory is full. Cannot add more cars.");
            return;
        }

        for (int i = 0; i < this.car.length; i++) {
            if (this.car[i] == null) {
                this.car[i] = car;
                number_of_car++;
                available_cars = capacity - number_of_car;
                System.out.println("Car with ID " + car.getCarId() + " added to inventory.");
                break;
            }
        }
    }


    public void removeCarFromInventory(Car carToRemove) {
        if (number_of_car == 0) 
        {
            System.out.println("Inventory is empty. No cars to remove.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < number_of_car; i++)
        {
            if (car[i] != null && car[i].equals(carToRemove)) 
            {
                found = true;
                car[i].setStatus(CarStatus.SOLD); // Set status to SOLD when removed

                // Notify CarRecord to remove the car
                carRecord.removeCarFromRecord(car[i]);

                // Shift elements to the left
                for (int j = i; j < number_of_car - 1; j++) 
                {
                    car[j] = car[j + 1];
                }

                car[number_of_car - 1] = null;
                number_of_car--;
                available_cars = capacity - number_of_car;

                    break;
            }
        }

            if (!found) 
            {
                System.out.println("Car not found in inventory.");
            }
    }

    public String getInventoryId() { 
        return inventory_id;
    }

    public int getCapacity() { 
        return capacity; 
    }
    
    public int getAvailableCars() { 
        return available_cars; 
    }
    public int getNumberOfCars() { 
        return number_of_car; 
    }
    public Car[] getCarArray() { 
        return car; 
    }
}
