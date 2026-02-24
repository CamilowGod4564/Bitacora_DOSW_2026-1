package edu.dosw.bitacora.semana3.Bridge_FigurasyColores;

public class Cuadrado extends Formas{

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("[------------]");
        System.out.println("Dibujando cuadrado de color " + color.getColor());

        System.out.println("[-----]");
        System.out.println("[     ] -- "+color.getColor()+" --");
        System.out.println("[     ]");
        System.out.println("[-----]");


        System.out.println("[------------]");
    }
}
