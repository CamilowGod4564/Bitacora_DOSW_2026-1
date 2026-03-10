package edu.dosw.bitacora.semana3.Builder_Fabrica_de_juguetes;

public class MainClass {

    public static void main(String[] args) {
        ToyFactory factory = new ToyFactory();

        ActionDollBuilder actionBuilder = new ActionDollBuilder();
        factory.constructDoll(actionBuilder);
        ToyDoll actionDoll = actionBuilder.getResult();

        ClassicDollBuilder classicBuilder = new ClassicDollBuilder();
        factory.constructDoll(classicBuilder);
        ToyDoll classicDoll = classicBuilder.getResult();

        actionDoll.showInfo();
        classicDoll.showInfo();

    }



}
