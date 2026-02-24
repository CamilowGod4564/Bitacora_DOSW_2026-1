package edu.dosw.bitacora.semana3.Bridge_FigurasyColores;

public class FigurasYColores {
    public static void main(String[] args) {
        Formas circuloRojo = new Circulo(new Rojo());
        Formas circuloAzul = new Circulo(new Azul());

        Formas cuadradoRojo = new Cuadrado(new Rojo());
        Formas cuadradoAzul = new Cuadrado(new Azul());

        cuadradoRojo.dibujar();
        cuadradoAzul.dibujar();
        circuloRojo.dibujar();
        circuloAzul.dibujar();
    }
}
