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
public class Ejercicio8 {

    public static void main(String[] args) {
        
        int total = 1;
        int total2 = 1;
        
        int a,b;
        
        
        for (int i = 1; i <= 10; i++) {
            
            total *= i;
            
        }
        
        System.out.println(total);
        System.out.println("----------------------------------------------");
        System.out.println("EJERCICIO 9");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce A y B: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        for (int i = a; i <=b; i++) {
            
            total2  *= i;
            
        }
        
        System.out.println(total2);
    }
}
