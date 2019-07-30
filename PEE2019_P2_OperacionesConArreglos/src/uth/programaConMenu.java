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
public class programaConMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Forma 1 de inicializar un arreglo
        String [] listaAlumnos=
        {"Juan","Maria Jose","Danilo"};
        
        //Recorrer un arreglo
        for (int i = 0; i < listaAlumnos.length; i++) {
            String listaAlumno = listaAlumnos[i];
            System.out.println("alumno "+i+":"+listaAlumno);
        }
        
        //Forma 2 de inicializar un arreglo
        double [] listaNotas=new double[5];
        listaNotas[0]=60;
        listaNotas[1]=80;
        listaNotas[2]=85;
        listaNotas[3]=90;
        listaNotas[4]=75;
        
        double sumaTotal=0;
        for (int i = 0; i < listaNotas.length; i++) {
            double listaNota = listaNotas[i];
            
            sumaTotal+=listaNotas[i];
            
            String resultado="No Evaluado";
            if (listaNota>=70) {
                resultado="(aprobado)";
            }else{
                resultado="(reprobado)";
            }
            System.out.println("alumno "+i+":"+listaNota+resultado);
        }
        
        System.out.println("Promedio: "
                +(sumaTotal/listaNotas.length));
      
    }
    
}
