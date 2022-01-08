/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavatutorizado.ejerciciosRepaso.Ud2;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int horas, minutos, dias;
        
        System.out.println("Introduce los segundos");
        int segundos = sc.nextInt();
        
        minutos = segundos / 60;
        horas = minutos /60;
        dias = horas / 24;
        
        System.out.println(segundos+" son: \n"+"minutos: "+minutos);
        System.out.println("Horas: "+horas);
        System.out.println("Días: "+dias);
        
    }
}
