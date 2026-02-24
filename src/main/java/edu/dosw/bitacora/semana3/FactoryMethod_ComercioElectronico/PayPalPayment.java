package edu.dosw.bitacora.semana3.FactoryMethod_ComercioElectronico;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        String monto = Double.toString(amount);
        System.out.println("[--------------------------------]");
        System.out.println("Metodo de pago: Paypal");
        System.out.println("\nProcesando...\n");
        System.out.println("Pago procesado con exito con un monto de " + monto);
        System.out.println("[--------------------------------]");

    }
}
