package patterns.behavioral.strategy;

public class Main {

    public static void main(String... args)
    {
        PaymentStrategy creditCard = new CreditCardPayment();

        PaymentStrategy payPal = new PayPalPayment();

        PaymentStrategy crypto = new CryptoPayment();

        PaymentStrategy stripe = new StripePayment();

        PaymentProcessor processor = new PaymentProcessor(creditCard); //initially

        processor.processPayment();

        processor.setPaymentStrategy(crypto);

        processor.processPayment();
    }
}