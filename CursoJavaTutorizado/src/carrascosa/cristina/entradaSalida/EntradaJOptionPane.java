/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrascosa.cristina.entradaSalida;

import javax.swing.JOptionPane;

/**
 *
 * @author carra
 */
public class EntradaJOptionPane {
    
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
        
        System.out.println("Tu nombre es "+nombre+" y tienes "+edad);
        
        
    }
    
}
