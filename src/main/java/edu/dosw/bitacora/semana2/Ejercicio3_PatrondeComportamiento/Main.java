package edu.dosw.bitacora.semana2.Ejercicio3_PatrondeComportamiento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Historial historial = new Historial();

        editor.escribir("Hola");
        historial.guardar(editor.guardar());
        System.out.println("Estado actual: " + editor.getTexto());

        editor.escribir("Hola Mundo");
        historial.guardar(editor.guardar());
        System.out.println("Estado actual: " + editor.getTexto());

        editor.escribir("Hola Mundo Java");
        System.out.println("Estado actual: " + editor.getTexto());

        System.out.println("--- DESHACER ---");
        editor.restaurar(historial.deshacer());
        System.out.println("Estado actual: " + editor.getTexto());

        editor.restaurar(historial.deshacer());
        System.out.println("Estado actual: " + editor.getTexto());
    }
}