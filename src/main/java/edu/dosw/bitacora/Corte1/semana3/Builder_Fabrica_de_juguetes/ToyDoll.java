package edu.dosw.bitacora.semana3.Builder_Fabrica_de_juguetes;

public class ToyDoll {
    private String head;
    private String body;
    private String arms;
    private String legs;
    private String hasAccessories;

    public void setHead(String head) {
        this.head = head;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setArms(String arms) {
        this.arms = arms;
    }
    public void setLegs(String legs) {
        this.legs = legs;
    }
    public void setHasAccessories(String hasAccessories) {
        this.hasAccessories = hasAccessories;
    }

    public void showInfo(){

        System.out.println(head);
        System.out.println(arms + body + arms);
        System.out.println(legs);
        System.out.println("Accesorios: "+hasAccessories);
    }
}
