package edu.dosw.bitacora.Corte2.semana1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

    }

    /**
     Obtener todos los estudiantes del equipo AZUL -> Retornar una lista de estudiantes cuyo team sea AZUL
     */
    public List<Student> EstudiantesAzul(List<Student> estudiantes) {
        return estudiantes.stream()
                .filter(student -> "AZUL".equals(student.team))
                .collect(Collectors.toList());
    }

    /**
     Obtener todos los nombres de estudiantes ordenados Alfabeticamente
     */
    public List<String> NombresOrdenadosAlfabeticamente(List<Student> estudiantes) {
        return estudiantes.stream()
                .map(student -> student.name)
                .sorted()
                .collect(Collectors.toList());
    }
    /**
     Calcular el promedio general de todos los score existentes en el sistema
     */
    public double getPromedioGeneral(List<Student> estudiantes) {
        return estudiantes.stream()
                .flatMap(student -> student.grades.stream())
                .mapToDouble(grade -> grade.score)
                .average()
                .orElse(0.0);
    }
    /**
     Retornar por estudiante el primedio por materia -> Retornar un Map<String, Double> donde la clave es
     la materia y el valor el promedio
     */

    /**
     Retornar el estudiante cuyo promedio general sea el mas alto del curso
     */
    /**
     Retornar las materias reprobadas por equipo -> Retornar Map <String, Long> donde la clave es el nombre
     del equipo y el valor la cantidad total de materias reprobadas
     */
    /**
     Top 3 estudiantes con mas materias aprobadas -> Retornar lista ordenada de manera descendente
     */
    /**
     Agrupar estudiantes por estado academico: Clasificarlos por ALTO RENDIMIENTO -> Promedio >=4,5 ,
     REGULAR -> Promedio entre 3,5 y 4.49, RIESGO -> promedio < 3,5
     */
    /**
     Obtener la materia con mas reprobaciones
     */
    /**
     Tome solo estudiantes del equipo AZUL, Obtenga todas sus notas, Filtre solo notas aprobadas, Agrupe por materia,
     Calcule promedio por materia, Ordene descendente por promedio, Retorne un LinkedHashMap preservando orden
     */




}
