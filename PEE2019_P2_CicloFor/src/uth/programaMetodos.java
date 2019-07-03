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
public class programaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        incrementarNumeros(1,5);
        decrecerNumeros(1,4);
        
        System.out.println("piramide simple");
        dibujarPiramide(5);
        
        System.out.println("Piramide doble");
        dibujarPiramideDoble(5);
        
        System.out.println("Piramide doble invertida");
        dibujarPiramideDobleInvertida(5);
        
        System.out.println("Rombo");
        dibujarRombo(5);
    }

    public static void dibujarRombo(int numeroLineas){
        dibujarPiramideDoble(numeroLineas);
        dibujarPiramideDobleInvertida(numeroLineas-1);
    }
    
    public static void dibujarPiramide(int numeroLineas){
        for (int i = 1; i <= numeroLineas; i++) {
            incrementarNumeros(1, i);
            System.out.println("");
        }
    }
    public static void dibujarPiramideDoble(int numeroLineas){
        for (int i = 1; i <= numeroLineas; i++) {
            int noEspacios=numeroLineas-i;
            imprimirEspacio(noEspacios);
            decrecerNumeros(2, i);
            incrementarNumeros(1, i);
            System.out.println("");
        }
    }    

    public static void dibujarPiramideDobleInvertida(int numeroLineas){
        for (int i = numeroLineas; i >= 1; i--) {
            int noEspacios=numeroLineas-i;
            imprimirEspacio(noEspacios);
            
            decrecerNumeros(2, i);
            incrementarNumeros(1, i);
            System.out.println("");
        }
    }    
    
    public static void imprimirEspacio(int espacios){
        for (int i = 0; i < espacios; i++) {
            System.out.print("  ");
        }
    }
    
    public static void 
        incrementarNumeros(
                int limiteInferior,
                int limiteSuperior
        ) {
        //Incrementando
        for (int i = limiteInferior;
                i <= limiteSuperior; i += 1) {
            System.out.print(i+" ");
        }
    }

    public static void decrecerNumeros
        (int limiteInferior, int limiteSuperior) {
        //Decreciendo 
        for (int i = limiteSuperior; i >= limiteInferior; i -= 1) {
            System.out.print(i+" ");
        }
    }
}
