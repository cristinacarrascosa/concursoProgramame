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
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hombres, mujeres;

        System.out.print("Introduce la cantidad de mujeres de la clase: ");
        mujeres = sc.nextInt();
        System.out.print("Introduce la cantidad de hombres de la clase: ");
        hombres = sc.nextInt();
        
        if(mujeres > hombres){
            System.out.println("Hay más mujeres");
        }else if ( mujeres == hombres){
            System.out.println("Hay la misma cantidad de hombres que de mujeres");
        }else 
            System.out.println("Hay más hombres que mujeres");
        
        System.out.println("El porcentaje de mujeres de la clase es: "+(mujeres*(hombres+mujeres)/100)+"%");
        System.out.println("El porcentaje de hombres de la clase es: "+(hombres*(hombres+mujeres)/100)+"%");
        
        
    }
}
