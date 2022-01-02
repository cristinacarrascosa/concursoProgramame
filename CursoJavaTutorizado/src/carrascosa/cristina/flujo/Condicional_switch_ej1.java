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
public class Condicional_switch_ej1 {

    public static void main(String[] args) {
        
        int hijos=Integer.parseInt(JOptionPane.showInputDialog("introduce nº hijos"));
        
        switch (hijos) {
            
            case 0:
                
                System.out.println("La natalalidad es baja, tenlo en cuenta");
                
                break;
                
            case 1:
                
                System.out.println("Por algo se empieza");
                
                break;
                
            case 2:
                
                System.out.println("Tienes la pareja");
                
                break;
                
            case 3:
                
                System.out.println("Veo que te estás animando!");
                
                break;
                
            case 4:
                
                System.out.println("Ya tienes familia numerosa");
                
                break;
                
            default:
                
                System.out.println("Vas a tener que trabajar duro!!");
        }
    }
}
