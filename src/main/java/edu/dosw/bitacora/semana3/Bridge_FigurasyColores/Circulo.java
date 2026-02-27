package edu.dosw.bitacora.semana3.Bridge_FigurasyColores;

public class Circulo extends Formas {
    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("\n[------------]");
        System.out.println("Dibujando circulo de color " + color.getColor());

        System.out.println(" *** ");
        System.out.println("*   *   -- "+color.getColor()+" -- ");
        System.out.println(" *** ");


        System.out.println("\n[------------]");

    }

}

