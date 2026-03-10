package edu.dosw.bitacora.semana3.Iterator_ViajeaRoma;

public class TourRoute implements Aggregate<Place>{
    private final Place[] places;

    public TourRoute() {
        places = new Place[]{
                new Place("Coliceo"),
                new Place("Roma"),
                new Place("España"),
                new Place("italia"),
        };
    }
    public Iterator<Place> createIterator() {
        return new RomeIterator();
    }


    private class RomeIterator implements Iterator<Place>{
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < places.length;
        }
        public Place next() {
            return places[currentIndex++];
        }
    }
}
