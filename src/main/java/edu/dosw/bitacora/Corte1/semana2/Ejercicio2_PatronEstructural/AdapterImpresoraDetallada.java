package edu.dosw.bitacora.semana2.Ejercicio2_PatronEstructural;

public class AdapterImpresoraDetallada implements ServicioImpresion {
    private ImpresoraDetallada detallada;
    private String autor;
    private String fecha;

    public AdapterImpresoraDetallada(ImpresoraDetallada detallada, String autor, String fecha) {
        this.detallada = detallada;
        this.autor = autor;
        this.fecha = fecha;
    }

    @Override
    public void imprimirMensaje(String mensaje) {
        detallada.imprimirDetalle(mensaje,this.autor,this.fecha);
    }
}
