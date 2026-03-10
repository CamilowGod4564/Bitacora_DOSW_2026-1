package edu.dosw.bitacora.semana3.Builder_Fabrica_de_juguetes;

public class ClassicDollBuilder implements ToyDollBuilder{

    private ToyDoll doll;

    public ClassicDollBuilder(){
        doll = new ToyDoll();
    }
    @Override
    public void buildHead(){
        doll.setHead("  (•‿•) ");
    }

    @Override
    public void buildBody(){
        doll.setBody("  <| |> ");
    }

    @Override
    public void buildArms(){
        doll.setArms("~");
    }

    @Override
    public void buildLegs(){
        doll.setLegs("  / \\  ");
    }

    @Override
    public void addAccessories(){
        doll.setHasAccessories("  🎀  ");
    }
    public ToyDoll getResult(){
        return doll;
    }
}
