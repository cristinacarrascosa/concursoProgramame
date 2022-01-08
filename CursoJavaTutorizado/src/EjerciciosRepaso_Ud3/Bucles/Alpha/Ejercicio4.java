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
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        
        System.out.print("Introduce A y B: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        for (int i = b; i >= a; i--) {
            
            System.out.println(i+" ");
            
        }
        
        System.out.println("-----------------------");
        for (int i = b; i >=a; i-=2) {
            System.out.println(" "+i);
        }
    }
}
