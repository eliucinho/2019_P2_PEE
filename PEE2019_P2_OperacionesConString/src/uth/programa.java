/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

/**
 *
 * @author uth
 */
public class programa {

    public static void main(String[] args) {
        String frase = "  hola mundo  ";

        System.out.println(frase.charAt(2));

        System.out.println(frase);
        System.out.println(frase.trim());
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());

        char[] arregloCaracteres
                = {'h', 'o', 'l', 'a'};
        
        imprimirArreglo(arregloCaracteres);
        
        //modificando el valor del arreglo
        arregloCaracteres[2]='j';
        
        imprimirArreglo(arregloCaracteres);
    }

    public static void imprimirArreglo(char[] arregloCaracteres) {
        System.out.println("======================");
        for (int i = 0; i < arregloCaracteres.length; i++) {
            System.out.println("i(" + i + ")=" + arregloCaracteres[i]);
        }
    }
}
