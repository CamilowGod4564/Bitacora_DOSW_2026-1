package edu.dosw.bitacora.semana3.AbstractFactory_EmpresadeVideojuegos;

public class PlayStationFactory implements ConsoleFactory{
    @Override
    public Controller createController() {
        return new  PlayStationController();
    }

    @Override
    public Game createGame() {
        return new  PlayStationGame();
    }

    @Override
    public UI createUI() {
        return new  PlayStationUI();
    }
}
