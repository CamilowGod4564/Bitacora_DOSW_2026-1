package edu.dosw.bitacora.semana3.Adapter_GasolineriaInteligente;

public class FastChargerAdapter implements FuelService {
    private FastElectricCharger charger;

    public FastChargerAdapter(FastElectricCharger charger) {
        this.charger = charger;
    }

    @Override
    public void supply(int liters){
        double kWh = convertLitersToKWh(liters);
        charger.fastCharger(kWh);
    }

    private double convertLitersToKWh(int liters){
        return liters * 8.0;
    }
}
