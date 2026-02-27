package edu.dosw.bitacora.semana3.Strategy_Aplicaciondenavegacion;

public class FastestRoute implements RouteStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculando ruta mas rapida...");
    }
}