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
public class Ejercicio16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int dado = (int)(Math.random()*(6-1+1)+1);
        
        System.out.print("Adivina el número entre 1 y 6: ");
        int adivinaDado = sc.nextInt();
        
        if (adivinaDado < 1 || adivinaDado > 6){
            System.out.println("Número erróneo");
        }else if (adivinaDado == dado){
            System.out.println("Acertaste!!, el dado es: "+dado+" :)");
        }else
            System.out.println("OHHH! :( \nLo siento el dado es: "+dado+" no coincide con: "+adivinaDado);
    }
}
