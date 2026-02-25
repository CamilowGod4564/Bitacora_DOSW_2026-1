package edu.dosw.bitacora.semana2.Ejercicio1_PatrónCreacional;

public abstract class NotificacionFabrica {

    protected abstract Mensaje crearNotificacion();

    public void enviarNotificacion(String mensaje){
        Mensaje notificacion = crearNotificacion();
        notificacion.enviarNotificacion(mensaje);
    }
}
