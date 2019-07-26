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
public class programaEjercicioString {

    public static void main(String[] args) {
        String frase = "**hola mundo**";

        //reemplazo de valor
        System.out.println("nueva frase= "
                + frase.replace('o', 'x'));

        /*System.out.println("===================");
        for(int i=0;i<frase.length();i++){
            System.out.println(frase.charAt(i));
        }*/
        
        System.out.println
        ("Frase invertida:"+
                invertir(frase)
                );
    }

    public static String invertir(String frase) {
        System.out.println("===================");
        String fraseTemporal = "";
        for (int i = (frase.length() - 1)
                ; i >= 0
                ; i--) {
            //System.out.println(frase.charAt(i));
            fraseTemporal += frase.charAt(i);
        }
        return fraseTemporal;
    }
}
