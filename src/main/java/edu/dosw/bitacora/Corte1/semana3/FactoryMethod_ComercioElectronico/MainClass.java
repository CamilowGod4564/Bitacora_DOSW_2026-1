package edu.dosw.bitacora.semana3.FactoryMethod_ComercioElectronico;

public class MainClass {
    public static void main(String[] args) {
        PaymentProcessor processor;

        processor = new CreditCardProcessor();
        processor.processPayment(100);

        processor = new PayPalProcessor();
        processor.processPayment(250);

        processor = new BankTransferProcessor();
        processor.processPayment(300);
    }
}
