package edu.dosw.bitacora.semana3.AbstractFactory_EmpresadeVideojuegos;

public class XboxFactory implements ConsoleFactory{
    @Override
    public Controller createController() {
        return new XboxContoller();
    }

    @Override
    public Game createGame() {
        return new XboxGame();
    }

    @Override
    public UI createUI() {
        return new XboxUI();
    }
}
