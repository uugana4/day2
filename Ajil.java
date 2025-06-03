// Vehicle.java
// Parent class Vehicle

// Declare the abstract class Vehicle
public abstract class Vehicle {
    
    // Private instance variable for the make of the vehicle
    private String make;
    
    // Private instance variable for the model of the vehicle
    private String model;
    
    // Private instance variable for the year of the vehicle
    private int year;
    
    // Private instance variable for the fuel type of the vehicle
    private String fuelType;
    
    // Private instance variable for the fuel efficiency of the vehicle
    private double fuelEfficiency;

    // Constructor for the Vehicle class, taking make, model, year, fuel type, and fuel efficiency as parameters
    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        // Initialize the make instance variable
        this.make = make;
        // Initialize the model instance variable
        this.model = model;
        // Initialize the year instance variable
        this.year = year;
        // Initialize the fuelType instance variable
        this.fuelType = fuelType;
        // Initialize the fuelEfficiency instance variable
        this.fuelEfficiency = fuelEfficiency;
    }
    
    // Public method to get the make of the vehicle
    public String getMake() {
        return make;
    }

    // Public method to get the model of the vehicle
    public String getModel() {
        return model;
    }

    // Public method to get the year of the vehicle
    public int getYear() {
        return year;
    }

    // Public method to get the fuel type of the vehicle
    public String getFuelType() {
        return fuelType;
    }

    // Public method to get the fuel efficiency of the vehicle
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    // Abstract method to calculate the fuel efficiency, to be implemented by subclasses
    public abstract double calculateFuelEfficiency();

    // Abstract method to calculate the distance traveled, to be implemented by subclasses
    public abstract double calculateDistanceTraveled();

    // Abstract method to get the maximum speed, to be implemented by subclasses
    public abstract double getMaxSpeed();
}
// Truck.java
// Child class Truck

// Declare the Truck class which extends the Vehicle class
public class Truck extends Vehicle {
    
    // Private instance variable for the cargo capacity of the truck
    private double cargoCapacity;

    // Constructor for the Truck class, taking make, model, year, fuel type, fuel efficiency, and cargo capacity as parameters
    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
        // Call the constructor of the superclass (Vehicle) with make, model, year, fuel type, and fuel efficiency
        super(make, model, year, fuelType, fuelEfficiency);
        // Initialize the cargoCapacity instance variable
        this.cargoCapacity = cargoCapacity;
    }
   
    // Public method to get the cargo capacity of the truck
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    // Override the calculateFuelEfficiency method from the superclass (Vehicle)
    @Override
    public double calculateFuelEfficiency() {
        // Implementation for fuel efficiency calculation for trucks
        return getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    // Override the calculateDistanceTraveled method from the superclass (Vehicle)
    @Override
    public double calculateDistanceTraveled() {
        // Implementation for distance traveled calculation for trucks
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    // Override the getMaxSpeed method from the superclass (Vehicle)
    @Override
    public double getMaxSpeed() {
        // Implementation for maximum speed calculation for trucks
        return 80.0;
    }
}
// Car.java
// Child class Car

// Declare the Car class which extends the Vehicle class
public class Car extends Vehicle {
    
    // Private instance variable for the number of seats in the car
    private int numSeats;

    // Constructor for the Car class, taking make, model, year, fuel type, fuel efficiency, and number of seats as parameters
    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
        // Call the constructor of the superclass (Vehicle) with make, model, year, fuel type, and fuel efficiency
        super(make, model, year, fuelType, fuelEfficiency);
        // Initialize the numSeats instance variable
        this.numSeats = numSeats;
    }

    // Public method to get the number of seats in the car
    public int getNumSeats() {
        return numSeats;
    }

    // Override the calculateFuelEfficiency method from the superclass (Vehicle)
    @Override
    public double calculateFuelEfficiency() {
        // Implementation for fuel efficiency calculation for cars
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }

    // Override the calculateDistanceTraveled method from the superclass (Vehicle)
    @Override
    public double calculateDistanceTraveled() {
        // Implementation for distance traveled calculation for cars
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    // Override the getMaxSpeed method from the superclass (Vehicle)
    @Override
    public double getMaxSpeed() {
        // Implementation for maximum speed calculation for cars
        return 120.0;
    }
} 