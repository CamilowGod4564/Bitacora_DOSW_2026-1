package edu.dosw.bitacora.semana3.Decorador_Simuladordebatallanaval;

import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Barco barcoBase = new BarcoBase();

        Map<String, Function<Barco, Barco>> mejoras = new HashMap<>();
        mejoras.put("BLINDAJE",     barco -> new BlindajeDecorador(barco));
        mejoras.put("RADAR",        barco -> new RadarDecorator(barco));
        mejoras.put("MISILES",      barco -> new MisilesDecorator(barco));
        mejoras.put("ANTITORPEDOS", barco -> new AntiTorpedosDecorator(barco));

        List<String> configuracion = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES"
        );

        Barco barcoFinal = barcoBase;
        for (String mejora : configuracion) {
            barcoFinal = mejoras.get(mejora).apply(barcoFinal);
        }

        System.out.println(barcoFinal.getDescription());
        System.out.println("Ataque:  " + barcoFinal.poderAtaque());
        System.out.println("Defensa: " + barcoFinal.defensa());
    }
}