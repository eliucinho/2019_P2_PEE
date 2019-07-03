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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //El ciclo for necesita 3 instrucciones
        //1.- Inicializar la variable a contar
        //2.- Condicionar para la repeticion
        //3.- Incrementador
        
        //Incrementando
        for (int i = 0; i <= 100; i+=3) {
            System.out.println("i: "+i);
        }
        
        //Operador de incremento ++, es igual a decir i=i+1;
        //Operador de incremento es i+=1;, para que sea de 3 en 3... i+=3;
        
        //Decreciendo 
        for (int i = 100; i >= 0; i-=3) {
            System.out.println("i: "+i);
        }
        
    }
    
}
