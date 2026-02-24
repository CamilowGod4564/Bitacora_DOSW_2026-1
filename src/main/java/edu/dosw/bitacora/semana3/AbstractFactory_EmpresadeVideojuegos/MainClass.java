package edu.dosw.bitacora.semana3.AbstractFactory_EmpresadeVideojuegos;

public class MainClass {
    public static void main(String[] args) {
        ConsoleFactory factory;

        factory = new PlayStationFactory();
        GameEnginee psEngine = new GameEnginee(factory);
        psEngine.run();

        System.out.println("\n-------------\n");

        factory = new XboxFactory();
        GameEnginee xboxEngine = new GameEnginee(factory);
        xboxEngine.run();


    }
}
