package edu.dosw.bitacora.semana3.Decorador_Simuladordebatallanaval;

public abstract class BarcoBaseDecorador implements Barco{
    protected Barco barco;

    public BarcoBaseDecorador(Barco barco) {
        this.barco = barco;
    }
}
