package edu.dosw.bitacora.semana2.Ejercicio1_PatrónCreacional;

public class SMSFabrica extends NotificacionFabrica{
    @Override
    public Mensaje crearNotificacion() {
        return new SMS();
    }
}
