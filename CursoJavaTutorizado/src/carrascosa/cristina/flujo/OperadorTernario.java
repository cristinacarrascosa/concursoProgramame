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
public class OperadorTernario {

    public static void main(String[] args) {
        
        double salario_mayor;
        
        double salario1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario"));
        
        double salario2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo salario"));
        
        salario_mayor = (salario1>salario2)?salario1:salario2; 
        
        System.out.println("El salario mayor es: "+salario_mayor);
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
        
        String mayor = (edad>18)?"Eres mayor de edad":"Eres menor de edad";
        
        System.out.println(mayor);
    }
}
