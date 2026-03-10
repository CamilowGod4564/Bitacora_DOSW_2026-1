package edu.dosw.bitacora.semana3.AbstractFactory_EmpresadeVideojuegos;

public class XboxGame implements Game{
    @Override
    public void start() {
        System.out.println("Halo, exclusivo de xbox listo para jugar");
    }
}
