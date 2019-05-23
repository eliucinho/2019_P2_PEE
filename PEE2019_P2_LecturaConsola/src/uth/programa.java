/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import java.util.Scanner;

/**
 *
 * @author eliucinho
 */
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //concatenar con parametros
        String mensajePlantilla=" Nombre: %s Apellido: %s %s"; //%s indica que va a recibir un valor variable de tipo String
        String nombre="Angel";
        String apellido="David";
        
        //Al mensaje plantilla, se va a insertar el valor de la variable nombre y la variabel apellido
        String mensajeFinal= String.format(mensajePlantilla, nombre,apellido,"hola");
        
        System.out.println("Mensaje plantilla sin format: "+mensajePlantilla);
        System.out.println("Mensaje final: "+mensajeFinal);
        System.out.println(" Nombre: "+nombre+" Apellido: "+apellido);
        
        //imprimiendo doble comilla y comilla simple
        System.out.println(" \"nombre\" ");
        
        //Salto de linea
        System.out.println(" Estoy arriba");
        System.out.println(" Estoy abajo");
        
        System.out.println(" Estoy arriba \n Estoy abajo");
        
        //Leer informacion del teclado
        //Se utiliza una libreria llamada Scanner
        Scanner scan=new Scanner(System.in);
        
        //NOTA: no olvidar realizar el import del Scanner
        
        //Todas las lecturas se asignan a variables
        //Leyendo texto
        
        System.out.println("Escriba un saludo: ");
        String textoDelTeclado=scan.nextLine();
        System.out.println("Texto leido: "+textoDelTeclado);
        
        //Leyendo enteros
        System.out.println("En que año estamos?");
        int anio=scan.nextInt();
        System.out.println("Año leido: "+anio);
        
        //Leyendo decimales
        System.out.println("Cuanto vale la entrada al cine?");
        double precio=scan.nextDouble();
        System.out.println("Precio leido: "+precio);
    } // Final del metodo main
    
} // final de clase
