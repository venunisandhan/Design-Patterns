package patterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void processPayment()
    {
        System.out.println("CreditCard Payment");
    }
}
