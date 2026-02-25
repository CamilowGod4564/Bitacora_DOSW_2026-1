package edu.dosw.bitacora.semana3.Decorador_Simuladordebatallanaval;

public class BarcoBase implements Barco{
    @Override
    public String getDescription() {
        return "Barco base";
    }

    @Override
    public int poderAtaque() {
        return 10;
    }

    @Override
    public int defensa() {
        return 10;
    }
}
