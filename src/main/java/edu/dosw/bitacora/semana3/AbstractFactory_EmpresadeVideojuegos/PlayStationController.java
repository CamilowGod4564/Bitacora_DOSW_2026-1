package edu.dosw.bitacora.semana3.AbstractFactory_EmpresadeVideojuegos;

public class PlayStationController implements Controller {

    @Override
    public void connect() {
        System.out.println("Control de PlayStation conectado");
    }
}