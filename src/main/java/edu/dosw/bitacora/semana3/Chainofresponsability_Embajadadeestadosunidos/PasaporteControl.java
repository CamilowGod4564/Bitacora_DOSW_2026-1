package edu.dosw.bitacora.semana3.Chainofresponsability_Embajadadeestadosunidos;

public class PasaporteControl extends ControlMigratorioHandler{
    @Override
    public void procesar(IngresoRequest request) {
        if (request.isPasaporteValido()){
            System.out.println("Pasaporte Valido, pasa a siguiente filtro...");
            super.procesar(request);
        }else {
            System.out.println("Pasaporte Invalido, proceso cancelado");
        }

    }
}
