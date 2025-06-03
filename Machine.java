
public class Machine {
    
    public static void main(String[] args) {

        
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);

        
        Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        
        System.out.println("Truck Model: " + truck.getModel());
        
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
     
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

    
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");
    }
}