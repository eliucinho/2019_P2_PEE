/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import java.util.Scanner;

/**
 *
 * @author uth
 */
public class programaGenericoNotasAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numeroAlumnos;

        System.out.println("Cuantos alumnos tiene?");
        numeroAlumnos = scan.nextInt();

        //Forma 1 de inicializar un arreglo
        String[] listaAlumnos = new String[numeroAlumnos];
        double[] listaNotas = new double[numeroAlumnos];

        leerNombresAlumnos(listaAlumnos);
        leerNotas(listaNotas,listaAlumnos);
        evaluarNotas(listaNotas,listaAlumnos);
    }

    public static void leerNombresAlumnos(String[] listaAlumnos) {
        Scanner scan = new Scanner(System.in);
        //Recorrer un arreglo
        for (int i = 0; i < listaAlumnos.length; i++) {
            System.out.println("¿QUien es el alumno " + i + "?");
            String nombre = scan.next();
            listaAlumnos[i] = nombre;
        }
    }

    public static void leerNotas(double[] listaNotas, String [] listaAlumnos) {
        Scanner scan = new Scanner(System.in);
//Forma 2 de inicializar un arreglo
        double sumaTotal = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            System.out.println("¿Cual es la calificacion del alumno " + listaAlumnos[i] + "?");
            double nota = scan.nextDouble();

            listaNotas[i] = nota;

            sumaTotal += listaNotas[i];
        }
        System.out.println("Promedio: "
                + (sumaTotal / listaNotas.length));
    }

    public static void evaluarNotas(double[] listaNotas, String [] listaAlumnos) {
        System.out.println("IMPRIMIENDO RESULTADOS");
        for (int i = 0; i < listaNotas.length; i++) {
            double nota = listaNotas[i];
            String resultado = "No Evaluado";
            if (nota >= 70) {
                resultado = "(aprobado)";
            } else {
                resultado = "(reprobado)";
            }
            System.out.println("alumno " + listaAlumnos[i] + ":" + nota + resultado);
        }
    }
}
