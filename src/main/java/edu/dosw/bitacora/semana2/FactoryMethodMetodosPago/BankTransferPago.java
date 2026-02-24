package edu.dosw.bitacora.semana2.FactoryMethodMetodosPago;

public class BankTransferPago implements Payment{
    @Override
    public void payment(double amount) {
        System.out.println("Pago con Transferencia bancaria por un saldo de " + Double.toString(amount) + " realizada con exito");
    }
}
