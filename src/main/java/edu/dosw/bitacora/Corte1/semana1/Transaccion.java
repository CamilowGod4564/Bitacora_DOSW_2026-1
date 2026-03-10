package edu.dosw.bitacora.semana1;

public class Transaccion {
    private String id;
    private double amount;
    private boolean approved;

    Transaccion(String id, double amount, boolean approved) {
        this.id = id;
        this.amount = amount;
        this.approved = approved;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String isApproved() {
        String aprovada = null;
        if (approved) {
            aprovada = "APROVADO";
        } else {
            aprovada = "REPROVADO";
        }
        return aprovada;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

}
