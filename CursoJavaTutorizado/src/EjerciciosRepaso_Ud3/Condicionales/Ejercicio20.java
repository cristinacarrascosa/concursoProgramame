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
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int calificacion;
        
        System.out.println("Introduce la calificación");
        calificacion = sc.nextInt();
        
        if(calificacion < 3)System.out.println("Muy Deficiente");
        else if (calificacion  < 5)System.out.println("Insuficiente");
        else if (calificacion < 6)System.out.println("Bien");
        else if (calificacion < 9)System.out.println("Notable");
        else System.out.println("Sobresaliente");
    }
}
