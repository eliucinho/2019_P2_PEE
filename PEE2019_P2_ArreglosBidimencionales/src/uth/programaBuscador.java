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
public class programaBuscador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] arregloBidimensional
                = new String[3][2];

        arregloBidimensional[0][0] = "a";
        arregloBidimensional[0][1] = "hola";
        arregloBidimensional[1][0] = "c";
        arregloBidimensional[1][1] = "mundo";
        arregloBidimensional[2][0] = "e";
        arregloBidimensional[2][1] = "f";

        buscar(arregloBidimensional, "mundo");
    }

    public static void buscar(String[][] arregloBidimensional,
            String palabra
    ) {
        for (int i = 0; i < arregloBidimensional.length; i++) {
            for (int j = 0; j < arregloBidimensional[i].length; j++) {
                String valorCelda = arregloBidimensional[i][j];
                if (valorCelda.equals(palabra)) {
                    System.out.println("Encontrador en " + i + "," + j);
                }
            }
        }
    }

}
