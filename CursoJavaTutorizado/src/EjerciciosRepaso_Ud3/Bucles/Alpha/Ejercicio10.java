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
public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int total = 0, precio;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Introduce el precio: ");
            precio = sc.nextInt();
            
            total += precio;
        }
        
        System.out.println("Total: "+total);
    }
}
