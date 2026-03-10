package edu.dosw.bitacora.semana3.FactoryMethod_ComercioElectronico;

public class CreditCardProcessor extends PaymentProcessor{
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
