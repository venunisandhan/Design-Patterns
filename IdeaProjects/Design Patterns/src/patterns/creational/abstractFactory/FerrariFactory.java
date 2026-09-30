package patterns.creational.abstractFactory;

public class FerrariFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Ferrari();
    }
}
