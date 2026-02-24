package edu.dosw.bitacora.semana3.AbstractFactory_EmpresadeVideojuegos;

public class XboxContoller implements Controller{
    @Override
    public void connect() {
        System.out.println("Control Xbox conectado");
    }
}
