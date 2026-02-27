package edu.dosw.bitacora.semana3.Chainofresponsability_Embajadadeestadosunidos;

public interface ControlMigratorio {
    public void procesar(IngresoRequest request);
    public void setSiguiente(ControlMigratorio siguiente);
}
