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
public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int precio = 0, total = 0;
        
        do {            
            
            System.out.print("Introduce precio: ");
            precio = sc.nextInt();
            if (precio > 0)
            total += precio;
            
        } while (precio > 0);
        
        System.out.println("Total: "+total);
    }
}
