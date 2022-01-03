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
public class NumeroFactorial {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un número"));
        
        long factorial = numero;
        
        for (int i = numero-1; i > 0; i--) {
            
            factorial = factorial*i;    
        }
        
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
}
