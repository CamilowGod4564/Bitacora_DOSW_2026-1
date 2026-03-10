package edu.dosw.bitacora.semana3.Composite_CajasDentroDeCajas;

public class Producto implements Item {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio(){
        return precio;
    }
}
