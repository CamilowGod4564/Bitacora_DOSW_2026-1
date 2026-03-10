package edu.dosw.bitacora.semana3.FactoryMethod_ComercioElectronico;

public abstract class PaymentProcessor {
    public abstract Payment createPayment();

    public void processPayment(double amount) {
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
