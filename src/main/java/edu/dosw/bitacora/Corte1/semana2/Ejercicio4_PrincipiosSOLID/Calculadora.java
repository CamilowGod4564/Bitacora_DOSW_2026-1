package edu.dosw.bitacora.semana2.Ejercicio4_PrincipiosSOLID;

public class Calculadora {
    public double ejecutar(Operacion operacion, double a, double b) {
        return operacion.calcular(a, b);
    }
}
