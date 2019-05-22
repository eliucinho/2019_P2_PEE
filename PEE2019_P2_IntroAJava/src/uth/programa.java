/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

/**
 *
 * @author eliucinho
 */
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="UTH";
        
        System.out.println(nombre);
        
        //Concatenar textos
        String apellido="Universidad";
        
        String nombreCompleto=nombre+apellido;
        
        System.out.println(nombreCompleto);
        System.out.println(nombre+apellido);
        System.out.println("UTH"+"Universidad");
        
        //Combinaciones de variables con texto
        System.out.println("El nombre es: "+nombre);
        
        int edad=18; //Nota: en un sistema de informacion, no se almacena la edad
        
        System.out.println("La edad es: "+edad);
        
        char estadoCivil='s';
        
        System.out.println("El estado civil es: "+estadoCivil);
        
        System.out.println(estadoCivil+edad);
        
        System.out.println(edad+10);
        
        double total=edad*2;
        
        System.out.println(total);
        
        System.out.println("Resultado de edad por 10: "+edad+10);
        System.out.println("Resultado de edad por 10 con parentesis: "+(edad+10));
        
    }
    
}
