package patterns.creational.factory;

public class Main {


    /* Creating vehicle objects like this is not good
       If object creation need to be changed , it has to be changed everywhere
       We need a centralised and encapsulated way of creating vehicles
       So we can change logic at one place , add more vehicle types
       Variety Of Objects

       Use VehicleFactory
     */

    /*public static void main(String... args)
    {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Truck();
        v2.start();
        v2.stop();

        Vehicle v3 = new Bike();
        v3.start();
        v3.stop();
    }*/

    public static void main(String... args)
    {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle v1 = vehicleFactory.getVehicle("Car");
        v1.start();
        v1.stop();

        Vehicle v2 = vehicleFactory.getVehicle("Truck");
        v2.start();
        v2.stop();

        Vehicle v3 = vehicleFactory.getVehicle("Bike");
        v3.start();
        v3.stop();
    }


}
