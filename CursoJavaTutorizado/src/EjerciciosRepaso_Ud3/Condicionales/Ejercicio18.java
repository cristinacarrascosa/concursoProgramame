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
public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char letra;
        
        System.out.print("Introduce una letra: ");
        letra = sc.nextLine().charAt(0);
        
        if(letra >= 'A' && letra <= 'Z')System.out.println("Es mayúscula");
        else if (letra >= 'a' && letra <= 'z')System.out.println("Es minúscula");
        else System.out.println("Carácter introducido incorrecto");        
    }

}
