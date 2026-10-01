package patterns.behavioral.strategy;

public class CryptoPayment implements PaymentStrategy{

    @Override
    public void processPayment()
    {
        System.out.println("Crypto Payment");
    }
}
