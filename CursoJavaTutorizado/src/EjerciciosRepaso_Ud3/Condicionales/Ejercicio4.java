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
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Introduce un número");
        numero = sc.nextInt();
        
        if(numero<0)System.out.println("El número es negativo");
        else System.out.println("El número es positivo");
    }
}
