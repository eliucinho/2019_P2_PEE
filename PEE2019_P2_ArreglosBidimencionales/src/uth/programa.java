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
        String[][] arregloBidimensional
                = new String[3][2];

        arregloBidimensional[0][0] = "a";
        arregloBidimensional[0][1] = "b";
        arregloBidimensional[1][0] = "c";
        arregloBidimensional[1][1] = "d";
        arregloBidimensional[2][0] = "e";
        arregloBidimensional[2][1] = "f";

        for (int i = 0
                ;i < arregloBidimensional.length
                ;i++) {
            for (int j = 0
                    ; j < arregloBidimensional[i].length
                    ; j++) {
                System.out.print
                (" " + arregloBidimensional[i][j]);
            }
            System.out.println("");
        }
    }

}
