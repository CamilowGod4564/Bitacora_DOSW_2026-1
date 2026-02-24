package edu.dosw.bitacora.semana3.Adapter_GasolineriaInteligente;

public class GasPump implements FuelService{

    @Override
    public void supply(int amount) {
        System.out.println("\n----------");
        System.out.println("Carro cargado con gasolina convecional");
        System.out.println("Carro cargado con " + amount +" Litros de gasolina" );
    }
}
