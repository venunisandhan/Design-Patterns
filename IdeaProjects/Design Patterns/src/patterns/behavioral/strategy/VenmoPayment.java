package patterns.behavioral.strategy;

public class VenmoPayment implements PaymentStrategy{

    @Override
    public void processPayment()
    {
        System.out.println("Venmo Payment");
    }
}
