/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrascosa.cristina.flujo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carra
 */
public class Ejercicio_BucleWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aleatorio = (int) (Math.random() * 100);

        int contador = 0;
        
        int numero = 0;

        

        while (numero != aleatorio) {
            
            System.out.println("Adivina el número entre 1 y 100");
            contador ++;

            numero = sc.nextInt();

            if (numero > aleatorio) {

                System.out.println("El nº es menor");
                
                 

            } else {

                System.out.println("El nº es mayor");
                
                
            }

        }

       

        JOptionPane.showMessageDialog(null, "Correcto, lo has intentado " + contador + " veces.");
    }
}
