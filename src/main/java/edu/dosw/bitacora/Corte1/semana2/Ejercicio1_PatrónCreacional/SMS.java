package edu.dosw.bitacora.semana2.Ejercicio1_PatrónCreacional;

public class SMS implements Mensaje{
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("----------------------\n");
        System.out.println("Enviando notificacion por mensaje de texto...");
        System.out.println("Mensaje: "+mensaje);
        System.out.println("Notificacion enviada correctamente\n");
        System.out.println("----------------------\n");
    }
}
