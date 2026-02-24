package edu.dosw.bitacora.semana3.Composite_CajasDentroDeCajas;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Item {

    private String nombre;
    private List<Item> items = new ArrayList<>();

    public Caja(String nombre){
        this.nombre = nombre;
    }

    public void agregar(Item item){
        items.add(item);
    }

    @Override
    public double getPrecio(){
        double total = 0;

        for(Item item : items){
            total += item.getPrecio();
        }

        return total;
    }
}