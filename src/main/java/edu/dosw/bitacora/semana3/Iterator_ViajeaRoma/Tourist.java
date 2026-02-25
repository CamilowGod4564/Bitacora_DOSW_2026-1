package edu.dosw.bitacora.semana3.Iterator_ViajeaRoma;

public class Tourist {
    public void exploreTour(Aggregate<Place> route) {
        Iterator<Place> iterator = route.createIterator();
        while (iterator.hasNext()) {
            Place place = iterator.next();
            System.out.println("Visitando "+place.getName());
        }
    }
}
