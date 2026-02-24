package edu.dosw.bitacora.semana2.FactoryMethodMetodosPago;

public abstract class PaymentProcessor {

    /**
     * Metodo que implementaremos en las clases creadoras para crear un objeto
     */
    public abstract void createPayment();


    /**
     * Metodo que tienen en comun todos los metodos de pago para procesar el pago
     */
    public void processPayment(){

    };
}
