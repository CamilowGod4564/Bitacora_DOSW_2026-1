package edu.dosw.bitacora.semana3.Chainofresponsability_Embajadadeestadosunidos;

public class MotivoViajeControl extends ControlMigratorioHandler{
    @Override
    public void procesar(IngresoRequest request) {
        if (request.isMotivoValido()){
            System.out.println("Motivo valido, pasa al siguiente filtro...");
            super.procesar(request);
        }else  {
            System.out.println("Motivo invalido, proceso cancelado.");
        }

    }
}
