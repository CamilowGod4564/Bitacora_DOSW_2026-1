package edu.dosw.bitacora.semana1;

public class Usuarios {
    private String nombre;
    private String id;
    private String edad;
    private boolean activo;
    public Usuarios(String nombre, String id, String edad, boolean activo) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.activo = activo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
