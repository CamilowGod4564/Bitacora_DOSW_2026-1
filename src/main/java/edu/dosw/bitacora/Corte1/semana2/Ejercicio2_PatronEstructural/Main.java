package edu.dosw.bitacora.semana2.Ejercicio2_PatronEstructural;

public class Main {
    public static void main(String[] args) {

        // Usando ImpresoraA normalmente
        ImpresoraSimple impresoraA = new ImpresoraSimple();
        impresoraA.imprimirMensaje("Hola desde Impresora Simple");

        System.out.println("---");

        // Usando ImpresoraB a través del Adapter
        ImpresoraDetallada impresoraB = new ImpresoraDetallada();
        ServicioImpresion adapter = new AdapterImpresoraDetallada(impresoraB, "Juan", "2025-01-01");
        adapter.imprimirMensaje("Hola desde Impresora Detallada");
    }
}