package edu.dosw.bitacora.semana3.Chainofresponsability_Embajadadeestadosunidos;

public class Main {
    public static void main(String[] args) {
        ControlMigratorio pasaporte = new PasaporteControl();
        ControlMigratorio antecedentes = new AntecedentesControl();
        ControlMigratorio motivo = new MotivoViajeControl();
        ControlMigratorio aprobacion = new AprovacionFinalControl();

        pasaporte.setSiguiente(antecedentes);
        antecedentes.setSiguiente(motivo);
        motivo.setSiguiente(aprobacion);

        IngresoRequest persona = new IngresoRequest(true,true,true,false);

        pasaporte.procesar(persona);
    }
}
