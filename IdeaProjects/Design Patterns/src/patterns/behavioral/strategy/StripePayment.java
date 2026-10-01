package patterns.behavioral.strategy;

public class StripePayment implements PaymentStrategy{

    @Override
    public void processPayment()
    {
        System.out.println("Stripe Payment");
    }
}
