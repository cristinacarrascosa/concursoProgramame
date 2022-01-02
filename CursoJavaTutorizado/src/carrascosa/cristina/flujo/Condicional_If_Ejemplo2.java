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
public class Condicional_If_Ejemplo2 {

    public static void main(String[] args) {
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
        
        if (edad < 18) {
            System.out.println("Eres muy joven");
        }else if ( edad < 40) {
            System.out.println("Eres joven");
        }else if(edad<65){
            System.out.println("Eres maduro");
        }else {
            System.out.println("Cuídate!!");
        }
    }
}
