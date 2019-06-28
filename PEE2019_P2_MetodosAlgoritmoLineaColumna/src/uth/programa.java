/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import java.util.Scanner;

/**
 *
 * @author eliud
 */
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Cuantos numeros necesita?");
        int numero = scan.nextInt();

        dibujarPiramide(numero);
        
        dibujarLinea(10);
        dibujarLinea(5);
        dibujarLinea(15);
        dibujarLinea(3);
    }

    public static void dibujarPiramide(int numero) {
        int numeroLinea = 1;

        while (numeroLinea <= numero) {
            dibujarLinea(numeroLinea);
            numeroLinea++;
        }
    }

    public static void dibujarLinea(int limiteColumna) {
        int numeroColumna = 1;
        while (numeroColumna <= limiteColumna) {
            System.out.print(numeroColumna + " ");
            numeroColumna++;
        }
        System.out.println("");
    }
}
