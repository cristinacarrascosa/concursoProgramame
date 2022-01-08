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
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int edad;
        
        System.out.print("Introduce tu edad, por favor:");
        edad = sc.nextInt();
        
        if(edad >=18)System.out.println("Eres mayor de edad");
        else System.out.println("Eres menor de edad");
    }
}
