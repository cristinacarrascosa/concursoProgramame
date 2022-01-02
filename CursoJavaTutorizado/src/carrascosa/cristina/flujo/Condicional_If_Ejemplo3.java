/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrascosa.cristina.flujo;

import javax.swing.JOptionPane;

/**
 *
 * @author carra
 */
public class Condicional_If_Ejemplo3 {

    public static void main(String[] args) {
        
        int distancia_colegio;
        
        double renta_familiar;
        
        byte hermanos_centro;
        
        distancia_colegio = Integer.parseInt(JOptionPane.showInputDialog("Introduce distancia al colegio en km"));
        
        renta_familiar= Double.parseDouble(JOptionPane.showInputDialog("Introduce renta familiar"));
        
        hermanos_centro = Byte.parseByte(JOptionPane.showInputDialog("Introduce el nº de hermanos"));
        
        if(distancia_colegio>10 || renta_familiar<20000 || hermanos_centro>=2){
            System.out.println("El alumno tiene beca");
        }else{
            System.out.println("El alumno no tiene beca");
        }
                
    }
}
