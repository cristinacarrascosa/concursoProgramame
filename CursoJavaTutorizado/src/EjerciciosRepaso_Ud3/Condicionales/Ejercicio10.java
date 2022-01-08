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
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b;

        System.out.print("Introduce a: ");
        a = sc.nextDouble();
        System.out.print("Introduce b: ");
        b = sc.nextDouble();
        
        
        
        System.out.println("La suma es: "+(a+b));
        System.out.println("La resta es: "+(a-b));
        System.out.println("El producto es: "+(a*b));
        if ( b == 0)System.out.println("No se puede dividir por "+b);
        else System.out.println("La división es: "+(a/b));
    }
}
