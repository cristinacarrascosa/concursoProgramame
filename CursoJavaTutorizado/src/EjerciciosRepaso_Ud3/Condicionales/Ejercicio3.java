/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso_Ud3.Condicionales;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        System.out.print("Introduce a: ");
        a = sc.nextInt();
        System.out.print("Introduce b: ");
        b = sc.nextInt();
        
        if(a > b)System.out.println("El mayor es "+a);
        else System.out.println("El mayor es "+b);
    }
}
