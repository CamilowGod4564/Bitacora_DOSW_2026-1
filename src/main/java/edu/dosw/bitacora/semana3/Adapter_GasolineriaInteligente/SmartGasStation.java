package edu.dosw.bitacora.semana3.Adapter_GasolineriaInteligente;

public class SmartGasStation {
    public static void main(String[] args){
        FuelService gasolinePump = new GasPump();
        FuelService fastElectricPump = new FastChargerAdapter(new FastElectricCharger());
        FuelService slowElectricPump = new SlowChargerAdapter(new SlowElectricCharger());

        gasolinePump.supply(100);
        fastElectricPump.supply(100);
        slowElectricPump.supply(100);
    }
}
