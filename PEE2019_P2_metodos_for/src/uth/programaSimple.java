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
public class programaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Cuantos numeros necesita?");
        int numero = scan.nextInt();
        dibujarPiramide(numero);
    }

    public static void dibujarPiramide(int numero) {
        /*int numeroLinea = 1;
        while (numeroLinea <= numero) {
            dibujarColumnas(numeroLinea);
            numeroLinea++;
            System.out.println("");
        }*/
        for (int numeroLinea = 1; numeroLinea <= numero; numeroLinea++) {
            dibujarColumnas(numeroLinea);
            System.out.println("");
        }
    }

    public static void dibujarColumnas(int limiteColumna) {
        /*int numeroColumna = 1;
        while (numeroColumna <= limiteColumna) {
            System.out.print(numeroColumna + " ");
            numeroColumna++;
        }*/
        
        for(
            int numeroColumna=1; //inicializar variable a contar
            numeroColumna <= limiteColumna; //condicional de repetición
            numeroColumna++ //incrementar la variable
            ){
            System.out.print(numeroColumna + " ");
        }
    }

}
