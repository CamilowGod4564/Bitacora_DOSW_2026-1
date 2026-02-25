package edu.dosw.bitacora.semana3.Strategy_Aplicaciondenavegacion;

public class CheapestRoute implements RouteStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculando ruta mas economica...");
    }
}