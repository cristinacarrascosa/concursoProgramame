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
public class Ejercicios_CondicionalIF {
    
    public static void main(String[] args) {
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura, por favor"));
        
        String genero = JOptionPane.showInputDialog("introduce tu género, por favor");
        
        if(genero.equals("mujer")){
            
            int peso_ideal = altura - 120;
            
            JOptionPane.showMessageDialog(null, "Tu peso ideal es "+peso_ideal);
            
        }else {
            
            int peso_ideal = altura - 110;
            
            JOptionPane.showMessageDialog(null, "Tu peso ideal es "+peso_ideal);
            
        }
        
        
    }
    
}
