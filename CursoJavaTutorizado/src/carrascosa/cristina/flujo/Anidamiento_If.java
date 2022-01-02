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
public class Anidamiento_If {

    public static void main(String[] args) {
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor: "));
        
        boolean mayor_edad = true;
        
        if(edad>=18){
            
            mayor_edad=true;
            
        }
        
        if(mayor_edad) {
            
            String carnet = JOptionPane.showInputDialog("¿Tienes carnet?");
            
            if(carnet.equals("si"))JOptionPane.showMessageDialog(null, "Puedes compara el coche");
                
                
                
            else JOptionPane.showMessageDialog(null, "Sin carnet no hay coche");
                
                
            
        
        } else JOptionPane.showMessageDialog(null, "Si eres menor no puedes tener carnet y por lo tanto tampoco coche");
            
            
        
    }
}
