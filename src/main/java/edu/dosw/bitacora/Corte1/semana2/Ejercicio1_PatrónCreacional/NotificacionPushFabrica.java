package edu.dosw.bitacora.semana2.Ejercicio1_PatrónCreacional;

public class NotificacionPushFabrica extends NotificacionFabrica{
    @Override
    public Mensaje crearNotificacion() {
        return new NotificacionPush();
    }
}
