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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        System.out.print("Introduce A: ");
        a = sc.nextInt();
                
        System.out.print("Introduce B: ");
        b = sc.nextInt();
        
        for (int i = a; i <= b; i++) {
            System.out.print(i+" ");
        }
    }
}
