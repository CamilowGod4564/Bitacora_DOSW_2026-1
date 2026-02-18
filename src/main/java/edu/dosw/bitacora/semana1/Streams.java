package edu.dosw.bitacora.semana1;

import java.util.ArrayList;
import java.util.List;

public class Streams {

    /**
     * Ejercicio 1:
     * Dada una lista de numeros enteros, necesitamos obtener
     * una nueva lista solo con los numeros pares mayores a diez.
     */
    public List<Integer> paresMayoresDeDiez(List<Integer> lista){
        List<Integer> resultado = lista.stream()
                .filter(n -> n % 2 == 0)
                .filter(n-> n>10)
                .toList();

        return resultado;
    }

    /**
     * Ejercicio 2:
     * Dada una lista de palabras, se requiere: Filtrar las palabras que tengan mas de 4 caracteres,
     * convertirlas en Mayusculas, ordenarlas alfabeticamente y obtener la cantidad total de palabras resultantes.
     */
    public void cantidad(List<String> lista){
        List<String> resultado = lista.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        long contador = resultado.stream()
                .count();

        System.out.println(resultado);
        System.out.println(contador);
    }

    /**
     * Ejercicio 3:
     * Dada una lista de usuarios, Filtra unicamente los usuarios activos,
     * obten una lista con los nombres en mayuscula y ordena alfabeticamente el resultado,
     * el objeto usuario cuenta con los atributos:
     * - Id
     * - name
     * - age
     * - Active
     */
    public List<String> usuariosActivos(List<Usuarios> usuarios){
        List<String> resultado = usuarios.stream()
                .filter(e-> e.isActivo())
                .map(e -> e.getNombre())
                .map(String::toUpperCase)
                .sorted()
                .toList();
        return resultado;
    }

    /**
     * Ejercicio 4:
     * Dado un listado de Usuarios y utilizando los mismos
     * atributos anteriores, filtrar las personas mayores de edad y obtener sus nombres.
     */
    public List<String> nombresMayoresDeEdad(List<Usuarios> usuarios){
        List<String> resultado = usuarios.stream()
                .filter(e -> e.getEdad() >= 18)
                .map(e->e.getNombre())
                .toList();
        return resultado;
    }

    /**
     * Dada una lista de transacciones bancarias representadas por objetos:
     * class Transaction {
     *     String id;
     *     double amount;
     *     boolean approved;
     * }
     * Se requiere procesar la lista usando Streams para:
     * Usar peek para ver cada transacción procesada (Utilizar System.out.println para ver la transaccion)
     * Verificar si existe al menos una transacción no aprobada
     * Retornar true o false indicando si el lote de transacciones es válido.
     */
    public boolean verTransaccion(List<Transaccion> transacciones){
        List<String> resultados = transacciones.stream()
                .map(t -> t.isApproved())
                .peek(t -> System.out.println("Transaccion "+ t))
                .toList();

        boolean aprovadas = resultados.stream()
                .allMatch(t->t == "APROVADA");
        return aprovadas;
    }
}
