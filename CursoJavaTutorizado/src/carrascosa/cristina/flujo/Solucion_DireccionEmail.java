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
public class Solucion_DireccionEmail {

    public static void main(String[] args) {
        
        boolean valido = false;
        
        do {            
            
            String email = JOptionPane.showInputDialog("Introduce tu email por favor");
            
            int arroba = 0;
            
            boolean punto = false;
            
            for (int i = 0; i < email.length(); i++) {
                
                if(email.charAt(i)== '@')arroba++;
                if(email.charAt(i)=='.')punto=true;
            }
            
            if(arroba==1 && punto==true && email.length()>=4) valido=true;
            else JOptionPane.showMessageDialog(null, "Email no válido");
        } while (valido == false);
        
        System.out.println("Email correcto!");
    }
}
