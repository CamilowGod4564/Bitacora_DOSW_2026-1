package edu.dosw.bitacora.semana3.Chainofresponsability_Embajadadeestadosunidos;

public abstract class ControlMigratorioHandler implements ControlMigratorio{
    private ControlMigratorio siguiente;

    public void setSiguiente(ControlMigratorio siguiente) {
        this.siguiente = siguiente;
    }
    @Override
    public void procesar(IngresoRequest request) {
        if(siguiente != null){
            siguiente.procesar(request);
        }
    }
}
