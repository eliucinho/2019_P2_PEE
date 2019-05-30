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
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        System.out.println("¿Cual es el numero?");
        int numero=scan.nextInt();
        
        if (numero==0) {
            System.out.println("El numero es cero");
        }else if(numero==1){
            System.out.println("el numero es uno");
        }else if(numero==2){
            System.out.println("el numero es dos");
        }else if(numero==3){
            System.out.println("el numero es tres");
        }else{
            System.out.println("No se cual es el numero");
        }
        
        
    }
    
}
