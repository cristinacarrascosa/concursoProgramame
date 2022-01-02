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
public class EjemploWhile1 {

    public static void main(String[] args) {
        
        String clava = "Cris";
        
        String acceso = "";
        
        while (!clava.equals(acceso)) {
        
            acceso=JOptionPane.showInputDialog("Introduce la clave de acceso, por favor");
            
            if(!clava.equals(acceso)){
                
                System.out.println("La clave es incorrecta");
                
            }
            
        }
        
        System.out.println("Bienvenido a la zona de usuarios");
    }
}
