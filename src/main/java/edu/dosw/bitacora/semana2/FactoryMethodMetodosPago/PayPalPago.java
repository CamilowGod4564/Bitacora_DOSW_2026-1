package edu.dosw.bitacora.semana2.FactoryMethodMetodosPago;

public class PayPalPago implements Payment{
    @Override
    public void payment(double amount) {
        System.out.println("Pago por PayPal con un saldo de " + Double.toString(amount) + " realizada con exito");
    }
}
