package edu.dosw.bitacora.semana2.FactoryMethodMetodosPago;

public class CreditCardPago implements Payment{
    @Override
    public void payment(double amount) {
        System.out.println("Pago con tarjeta de credito por un saldo de " + Double.toString(amount) + " realizada con exito");

    }
}
