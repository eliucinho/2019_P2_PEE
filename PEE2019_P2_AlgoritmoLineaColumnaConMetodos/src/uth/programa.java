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
        Scanner scan=new Scanner(System.in);
        
        System.out.println("¿Cuantos numeros necesita?");
        int numero=scan.nextInt();
        
        int numeroLinea=1;
        int numeroColumna=1;
        
        while (numeroLinea<=numero) {            
            while (numeroColumna<=numeroLinea) {                
                System.out.print(numeroColumna+" ");
                numeroColumna++;
            }
            numeroLinea++;
            numeroColumna=1;
            System.out.println("");
        }
    }
    
}
