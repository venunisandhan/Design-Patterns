package patterns.creational.factory;

public class Bike implements Vehicle{

    @Override
    public void start()
    {
        System.out.println("Bike Is Starting");
    }

    @Override
    public void stop()
    {
        System.out.println("Bike Is Stopping");
    }
}
