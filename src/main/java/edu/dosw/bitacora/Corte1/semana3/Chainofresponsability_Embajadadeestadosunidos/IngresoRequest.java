package edu.dosw.bitacora.semana3.Chainofresponsability_Embajadadeestadosunidos;

public class IngresoRequest {
    private boolean pasaporteValido;
    private boolean antecedentesLimpios;
    private boolean motivoValido;
    private boolean aprobado;

    public IngresoRequest(boolean pasaporteValido, boolean antecedentesLimpios, boolean motivoValido, boolean aprobado) {
        this.pasaporteValido = pasaporteValido;
        this.antecedentesLimpios = antecedentesLimpios;
        this.motivoValido = motivoValido;
        this.aprobado = aprobado;
    }
    //Getters y Setters
    public boolean isPasaporteValido() {
        return pasaporteValido;
    }
    public void setPasaporteValido(boolean pasaporteValido) {
        this.pasaporteValido = pasaporteValido;
    }
    public boolean isAntecedentesLimpios() {
        return antecedentesLimpios;
    }
    public void setAntecedentesLimpios(boolean antecedentesLimpios) {
        this.antecedentesLimpios = antecedentesLimpios;
    }
    public boolean isMotivoValido() {
        return motivoValido;
    }
    public void setMotivoValido(boolean motivoValido) {
        this.motivoValido = motivoValido;
    }
    public boolean isAprobado() {
        return aprobado;
    }
    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

}
