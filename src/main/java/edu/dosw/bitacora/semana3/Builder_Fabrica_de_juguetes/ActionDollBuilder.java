package edu.dosw.bitacora.semana3.Builder_Fabrica_de_juguetes;

public class ActionDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;
    public ActionDollBuilder(){
        doll = new ToyDoll();
    }

    @Override
    public void buildHead(){
        doll.setHead("  [■]  ");
    }

    @Override
    public void buildBody(){
        doll.setBody(" |###| ");
    }

    @Override
    public void buildArms(){
        doll.setArms("-");
    }

    @Override
    public void buildLegs(){
        doll.setLegs("  / \\  ");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories("  ⚔\uFE0F  ");
    }

    public ToyDoll getResult(){
        return doll;
    }
}
