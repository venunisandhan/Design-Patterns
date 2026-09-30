package patterns.creational.factory;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType)
    {
        if(vehicleType.equalsIgnoreCase("Car")) return new Car();

        else if(vehicleType.equalsIgnoreCase("Truck")) return new Truck();

        else if(vehicleType.equalsIgnoreCase("Bike")) return new Bike();

        else throw new IllegalArgumentException("Unknown Vehicle Type Provided");
    }
}
