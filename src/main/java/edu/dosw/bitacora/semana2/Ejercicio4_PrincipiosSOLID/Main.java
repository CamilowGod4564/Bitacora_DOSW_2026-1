package edu.dosw.bitacora.semana2.Ejercicio4_PrincipiosSOLID;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("---------------");

        System.out.println("Suma: 3 + 8 = " + calc.ejecutar(new Suma(),8, 3));
        System.out.println("Resta: 5 - 4 = " + calc.ejecutar(new Resta(), 5, 4));
        System.out.println("Multiplicacion: 5 * 20 = " + calc.ejecutar(new Multiplicacion(), 5, 20));
        System.out.println("Division: 4/0" );
        System.out.println(calc.ejecutar(new Division(), 4, 0));
        System.out.println("Division: 20 / 5 = " + calc.ejecutar(new Multiplicacion(), 20, 5));

        System.out.println("---------------");

    }
}
