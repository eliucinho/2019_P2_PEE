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

    public static int exp(int valor
                        , int exponente){
        if (exponente==1) {
            return valor;
        }else{
            return 
                valor*exp(valor, exponente-1);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println
            ("Exponente de 2: "+exp(2, 5));
    }
    
}
