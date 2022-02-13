
package Ejercicio1;

import javax.swing.JOptionPane;


public class MainCuadrilatero {
    
    public static void main(String[] args) {
        
        Cuadrilatero c1;
        
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2"));
        
        if(lado1 == lado2){//Es un cuadrado
            c1 = new Cuadrilatero(lado1);
            System.out.println("Es un cuadrado");
        }
        else{
            c1 = new Cuadrilatero(lado1, lado2);
            System.out.println("Es un rectángulo");
        }
        System.out.println("El perímetro es: "+c1.getPerimetro());
        System.out.println("El área es: "+c1.getArea());
            
    }
    
}
