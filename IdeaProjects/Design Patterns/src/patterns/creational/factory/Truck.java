package patterns.creational.factory;

public class Truck implements Vehicle{

    @Override
    public void start()
    {
        System.out.println("Truck Is Starting");
    }

    @Override
    public void stop()
    {
        System.out.println("Truck Is Stopping");
    }
}
