package edu.dosw.bitacora.semana3.Chainofresponsability_Embajadadeestadosunidos;

public class AprovacionFinalControl extends ControlMigratorioHandler{
    @Override
    public void procesar(IngresoRequest request) {
        if (request.isAprobado()){
            System.out.println("Pasaporte aprobado, cumple con los requerimientos");
            super.procesar(request);
        }else {
            System.out.println("Pasaporte invalido, proceso cancelado.");
        }

    }
}
