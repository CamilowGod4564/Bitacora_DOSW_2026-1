package edu.dosw.bitacora.semana3.FactoryMethod_ComercioElectronico;

public class BankTransferProcessor extends PaymentProcessor{
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}
