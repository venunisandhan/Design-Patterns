package patterns.behavioral.strategy;

public class ZCashPayment implements PaymentStrategy{

    @Override
    public void processPayment()
    {
        System.out.println("ZCash Payment");
    }
}
