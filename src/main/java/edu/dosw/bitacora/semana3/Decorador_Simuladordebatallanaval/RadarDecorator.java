package edu.dosw.bitacora.semana3.Decorador_Simuladordebatallanaval;

public class RadarDecorator extends BarcoBaseDecorador{

    public RadarDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescription() {
        return barco.getDescription()+ " + radar avanzado";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque()+10;
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}
