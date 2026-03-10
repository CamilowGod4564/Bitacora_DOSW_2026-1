package edu.dosw.bitacora.semana3.FactoryMethod_ComercioElectronico;

public class PayPalProcessor extends PaymentProcessor{
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
