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
        
        System.out.println("¿Cuantos productos quiere?");
        int cantidad=scan.nextInt();
        
        System.out.println("¿cuanto vale el producto?");
        double precioProducto=scan.nextDouble();
        
        double subTotal=0;
        double descuento=0;
        double total=0;
        
        subTotal=(cantidad*precioProducto);
        //La condicional SI se representa con If
        if(cantidad>10){
            descuento=subTotal*0.20;
        }
        
        total=subTotal-descuento;
        System.out.println("El total es: "+total);
    }
    
}
