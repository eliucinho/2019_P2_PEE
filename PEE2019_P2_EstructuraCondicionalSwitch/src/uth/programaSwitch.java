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
public class programaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        System.out.println("¿Cual es el numero?");
        int numero=scan.nextInt();
        
        switch(numero){
            case 1: System.out.println("uno");
                    System.out.println("fin del primero");
                    System.out.println("fin del primero 2");
                    break;
            case 2: System.out.println("dos");break;
            case 3: System.out.println("tres");
                    System.out.println("Estoy en la linea 3");
                    break;
            case 4: System.out.println("cuatro");break;
            case 5: System.out.println("cinco");break;
            default: System.out.println("No reconocido");
        }
        
        System.out.println("Numero: ");
        int numeroAritmetico=scan.nextInt();
        
        System.out.println("Suma: "+(numeroAritmetico+numero));
        System.out.println("Resta: "+(numeroAritmetico-numero));
        System.out.println("Division: "+(numeroAritmetico/numero));
        System.out.println("Multiplicacion: "+(numeroAritmetico*numero));
        System.out.println("Residuo: "+(numeroAritmetico%numero));
    }
    
}
