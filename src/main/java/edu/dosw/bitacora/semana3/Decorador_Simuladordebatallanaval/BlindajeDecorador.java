package edu.dosw.bitacora.semana3.Decorador_Simuladordebatallanaval;

public class BlindajeDecorador extends BarcoBaseDecorador{
    public BlindajeDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription()+ " + Blindaje";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa() + 30;
    }
}
