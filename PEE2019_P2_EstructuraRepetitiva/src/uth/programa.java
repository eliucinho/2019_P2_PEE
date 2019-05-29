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
        Scanner scan = new Scanner(System.in);

        String respuesta = "S";
        while (!respuesta.toUpperCase().equals("N")) { //el texto String se compara con equals
            System.out.println("¿Cuantos productos quiere?");
            int cantidad = scan.nextInt();

            System.out.println("¿cuanto vale el producto?");
            double precioProducto = scan.nextDouble();

            double subTotal = 0;
            double descuento = 0;
            double total = 0;

            subTotal = (cantidad * precioProducto);
            //La condicional SI se representa con If
            if (cantidad > 10) {
                descuento = subTotal * 0.20;
            }

            total = subTotal - descuento;
            System.out.println("El total es: " + total);

            System.out.println("¿desea agregar otro producto? (S=Si, N=No)");
            respuesta = scan.nextLine();

            //mientras la respuesta sea distinta de N o sea distinta de S
            while (!respuesta.toUpperCase().equals("N")
                    && !respuesta.toUpperCase().equals("S")) {
                System.out.println("Caracteres no soportados, pruebe otra vez");
                respuesta = scan.nextLine();
            }

        }
    }

}
