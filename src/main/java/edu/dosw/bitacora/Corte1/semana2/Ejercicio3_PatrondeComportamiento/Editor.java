package edu.dosw.bitacora.semana2.Ejercicio3_PatrondeComportamiento;

public class Editor {
    private String texto;

    public void escribir(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public Memento guardar() {
        return new Memento(texto);
    }

    public void restaurar(Memento memento) {
        this.texto = memento.getTexto();
    }

}
