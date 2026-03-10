package edu.dosw.bitacora.semana3.Decorador_Simuladordebatallanaval;

public class AntiTorpedosDecorator extends BarcoBaseDecorador{
    public AntiTorpedosDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription()+" + AntiTorpedos";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque()+20;
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}
