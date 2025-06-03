
public abstract class Vehicle {
    
    private String make;
    
    private String model;
    
    private int year;
    
    private String fuelType;
    
    private double fuelEfficiency;

    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        
        this.make = make;
        
        this.model = model;
        
        this.year = year;
    
        this.fuelType = fuelType;
        
        this.fuelEfficiency = fuelEfficiency;
    }
    
    
    public String getMake() {
        return make;
    }

    
    public String getModel() {
        return model;
    }

    
    public int getYear() {
        return year;
    }

    
    public String getFuelType() {
        return fuelType;
    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();
}
public class Truck extends Vehicle {
    private double cargoCapacity;
    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }
    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    public double getMaxSpeed() {
        return 80.0;
    }
}

public class Car extends Vehicle {
    private int numSeats;
    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
        super(make, model, year, fuelType, fuelEfficiency);  
        this.numSeats = numSeats;
    }
    public int getNumSeats() {
        return numSeats;
    }
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    @Override
    public double getMaxSpeed() {
        return 120.0;
    }
} 