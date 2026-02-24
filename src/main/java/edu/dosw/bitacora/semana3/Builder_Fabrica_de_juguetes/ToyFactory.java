package edu.dosw.bitacora.semana3.Builder_Fabrica_de_juguetes;

public class ToyFactory {
    public void constructDoll(ToyDollBuilder builder) {
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.addAccessories();
    }
}
