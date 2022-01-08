/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso_Ud3.Bucles.Alpha;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio15ConBooleanos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        boolean negativo = false;
        boolean mayor99 = false;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Introduce valor: ");
            num = sc.nextInt();
            
            if (num < 0){
                negativo = true;
            }
            if (num > 99){
                mayor99 = true;
            }
        }
        
        if (negativo){
            System.out.println("Has introducido algún negativo");
        }else System.out.println("Ningún negativo");
        
        if (mayor99){
            System.out.println("Has introducido un número mayor que 99");
        }else System.out.println("Ningún número mayor que 99");
    }
}
