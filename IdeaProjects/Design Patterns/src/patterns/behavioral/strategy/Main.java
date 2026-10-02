package patterns.behavioral.strategy;

public class Main {

    public static void main(String... args)
    {
        PaymentStrategy creditCard = new CreditCardPayment();

        PaymentStrategy payPal = new PayPalPayment();

        PaymentStrategy crypto = new CryptoPayment();

        PaymentStrategy stripe = new StripePayment();

        PaymentStrategy venmo = new VenmoPayment();

        PaymentProcessor processor = new PaymentProcessor(creditCard); //initially

        processor.processPayment();

        processor.setPaymentStrategy(crypto);

        processor.processPayment();

        processor.setPaymentStrategy(venmo);

        processor.processPayment();
    }
}