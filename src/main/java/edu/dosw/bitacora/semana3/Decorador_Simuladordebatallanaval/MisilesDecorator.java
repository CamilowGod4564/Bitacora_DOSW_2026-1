package edu.dosw.bitacora.semana3.Decorador_Simuladordebatallanaval;

public class MisilesDecorator extends BarcoBaseDecorador{
    public MisilesDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription() + " + Misiles";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque()+40;
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}
