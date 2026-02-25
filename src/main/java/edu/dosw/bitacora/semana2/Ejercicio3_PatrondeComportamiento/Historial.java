package edu.dosw.bitacora.semana2.Ejercicio3_PatrondeComportamiento;

import java.util.Stack;

class Historial {
    private Stack<Memento> historial = new Stack<>();

    public void guardar(Memento memento) {
        historial.push(memento);
    }

    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}