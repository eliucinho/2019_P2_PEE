/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import java.util.Random;

/**
 *
 * @author uth
 */
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se debe importar la libreria para utilizar el tipo    
        //import java.util.Random;
        
        //asì se declara la variable random
        Random r=new Random();
        
        //el parametro dentro del nexT indica cual va a aser el rango
        //por ejemplo, este indica que los numero son del 0 al 99
        System.out.println(r.nextInt(100));
        
        int [][] arregloVeinte=new int[10][10];
        
        llenarArreglo(arregloVeinte);
        imprimirArreglo(arregloVeinte);
    }
    
    public static void llenarArreglo
                    (int [][] arreglo){
        Random r=new Random();
        for (int i = 0; i < arreglo.length; i++) {
            int[] is = arreglo[i];
            for (int j = 0; j < is.length; j++) {
                int k = is[j];
                is[j]=r.nextInt(100);
            }
        }
    }
    
    public static void imprimirArreglo(int [][] arreglo){
        Random r=new Random();
        for (int i = 0; i < arreglo.length; i++) {
            int[] is = arreglo[i];
            for (int j = 0; j < is.length; j++) {
                int k = is[j];
                System.out.print(" "+is[j]);
            }
            System.out.println("");
        }
    }
}
