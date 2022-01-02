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
public class Solucion_CalculoPotenciaJOptionPane {

    public static void main(String[] args) {
        
        double resultado = Math.pow(Integer.parseInt(JOptionPane.showInputDialog("Introduce la base")),Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente")));
        
        System.out.println("El resultado es "+resultado);
    }
}
