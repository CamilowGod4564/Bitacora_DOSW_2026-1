package edu.dosw.bitacora.semana3.Composite_CajasDentroDeCajas;

public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto("Laptop", 2000);
        Producto p2 = new Producto("Mouse", 100);
        Producto p3 = new Producto("Teclado", 150);

        Caja cajaPequena = new Caja("Caja pequeña");
        cajaPequena.agregar(p2);
        cajaPequena.agregar(p3);

        Caja cajaGrande = new Caja("Caja grande");
        cajaGrande.agregar(p1);
        cajaGrande.agregar(cajaPequena);

        System.out.println("\n[-----------]\n");

        System.out.println("Precio total de todos los elementos: " + cajaGrande.getPrecio()+ "$");

        System.out.println("\n[-----------]\n");
    }
}