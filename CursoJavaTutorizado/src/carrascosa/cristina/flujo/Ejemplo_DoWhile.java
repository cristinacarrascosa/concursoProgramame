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
public class Ejemplo_DoWhile {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la palabra o frase introducida \n"
        + "Para terminar escribe salir");
        
        String texto;
        
        do {            
            
            texto = JOptionPane.showInputDialog("Introduce el texto");
            
            JOptionPane.showMessageDialog(null, "El texto introducido tiene "+texto.length()+" caracteres");
            
        } while (!texto.equals("salir"));
        
        System.out.println("Has salido del programa");
    }
}
