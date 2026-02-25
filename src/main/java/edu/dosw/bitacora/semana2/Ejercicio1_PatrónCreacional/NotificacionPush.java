package edu.dosw.bitacora.semana2.Ejercicio1_PatrónCreacional;

public class NotificacionPush implements Mensaje{
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("----------------------\n");
        System.out.println("Enviando notificacion push...");
        System.out.println("Mensaje: "+mensaje);
        System.out.println("Notificacion enviada correctamente\n");
        System.out.println("----------------------\n");
    }
}
