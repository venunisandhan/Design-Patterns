package patterns.creational.abstractFactory;

public class Main {

    public static void main(String... args)
    {
        HondaFactory hf = new HondaFactory();

        Vehicle v1 = hf.createVehicle();
        v1.start();
        v1.stop();

        BMWFactory bf = new BMWFactory();

        Vehicle v2 = bf.createVehicle();
        v2.start();
        v2.stop();

        FerrariFactory ff = new FerrariFactory();

        Vehicle v3 = ff.createVehicle();
        v3.start();
        v3.stop();
    }
}
