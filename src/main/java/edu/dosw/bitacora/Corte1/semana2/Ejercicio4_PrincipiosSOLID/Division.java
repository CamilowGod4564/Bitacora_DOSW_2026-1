package edu.dosw.bitacora.semana2.Ejercicio4_PrincipiosSOLID;

public class Division implements Operacion{
    @Override
    public double calcular(double a,double b) {
        if(b==0){
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return a/b;
    }
}
