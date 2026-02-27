package edu.dosw.bitacora.semana3.AbstractFactory_EmpresadeVideojuegos;

public interface ConsoleFactory {
    public Controller createController();
    public Game createGame();
    public UI createUI();
}
