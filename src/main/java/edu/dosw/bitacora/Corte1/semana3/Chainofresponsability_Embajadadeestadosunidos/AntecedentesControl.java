package edu.dosw.bitacora.semana3.Chainofresponsability_Embajadadeestadosunidos;

public class AntecedentesControl extends ControlMigratorioHandler{
    @Override
    public void procesar(IngresoRequest request) {
        if (request.isAntecedentesLimpios()){
            System.out.println("Antecedentes limpios disponibles, pasa al siguiente filtro");
            super.procesar(request);
        }else {
            System.out.println("Antecedentes sospechosos, proceso cancelado");
        }

    }
}
