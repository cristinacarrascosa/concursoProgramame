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
public class Direccion_Email {

    public static void main(String[] args) {
        
        String email = "";
        
        while (!(email.length()>= 4 && email.contains("@") && email.contains("."))) {            
            
           email = JOptionPane.showInputDialog("Introduzca su dirección de email\n"+
                "Debe tener al menos 4 caracteres"); 
            
        }
    }
}
