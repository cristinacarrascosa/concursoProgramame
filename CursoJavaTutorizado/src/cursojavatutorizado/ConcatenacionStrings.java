/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavatutorizado;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class ConcatenacionStrings {
    public static void main(String[] args) {
        
        int edad;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad, por favor");
        
        edad = sc.nextInt();
        System.out.println("La edad introducida es: "+ edad);
    }
}
