package patterns.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void processPayment()
    {
        System.out.println("PayPal Payment");
    }
}
