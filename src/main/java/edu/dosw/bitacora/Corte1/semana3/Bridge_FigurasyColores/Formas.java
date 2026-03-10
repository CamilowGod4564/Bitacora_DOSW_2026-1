package edu.dosw.bitacora.semana3.Bridge_FigurasyColores;

public abstract class Formas {
    protected Color color;

    public Formas(Color color) {
        this.color = color;
    }
    public abstract void dibujar();

}
