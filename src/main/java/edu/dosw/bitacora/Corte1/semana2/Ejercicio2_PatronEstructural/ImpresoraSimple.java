package edu.dosw.bitacora.semana2.Ejercicio2_PatronEstructural;

public class ImpresoraSimple implements ServicioImpresion {
    @Override
    public void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
