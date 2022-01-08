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
public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Introduce a: ");
        a = sc.nextInt();
        System.out.println("Introduce b: ");
        b = sc.nextInt();
        
        if ( a % b == 0) System.out.println(a+ " es múltiplo de "+b);
        else System.out.println(a+ " no es múltiplo de "+b);
    }
}
