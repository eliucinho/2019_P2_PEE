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
public class programaPiramideDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        System.out.println("¿Cuantos numeros necesita?");
        int numero=scan.nextInt();
        
        int numeroLinea=1;
        int numeroColumna=1;
        int numeroEspacio=0;
        int contadorEspacios=0;
        //Hace el recorrido de las lineas
        while (numeroLinea<=numero) {  
            numeroEspacio=numero-numeroLinea;
            while (contadorEspacios<numeroEspacio) {                
                System.out.print("  ");
                contadorEspacios++;
            }
            numeroColumna=numeroLinea;
            while (numeroColumna<=numeroLinea) {                
                if (numeroColumna<=1) {
                    break;
                }
                System.out.print(numeroColumna+" ");
                numeroColumna--;
            }
            while (numeroColumna<=numeroLinea) {                
                System.out.print(numeroColumna+" ");
                numeroColumna++;
            }
            contadorEspacios=0;
            numeroLinea++;
            numeroColumna=1;
            System.out.println("");
        }
    }
    
}
