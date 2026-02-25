package edu.dosw.bitacora.semana2.Ejercicio1_PatrónCreacional;

public class MainClass {
    public static void main(String[] args) {
        NotificacionFabrica fabrica;

        fabrica = new CorreoElectronicoFabrica();
        fabrica.enviarNotificacion("Ingrese a este curso totalmente gratis el primer mes");

        fabrica = new SMSFabrica();
        fabrica.enviarNotificacion("Aproveche los nuevos planes de celular disponibles");

        fabrica = new NotificacionPushFabrica();
        fabrica.enviarNotificacion("Haga click aca para ganar gratis un viaje");
    }
}
