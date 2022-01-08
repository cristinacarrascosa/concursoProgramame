/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso_Ud3.Bucles.Alpha;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio15 {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        int num, contnegativos = 0, contMayor99 = 0;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Introduce un valor: ");
            num = sc.nextInt();
            if (num < 0)contnegativos ++;
            if (num > 99) contMayor99 ++;
            
        }
        
        System.out.println("Negativos: "+contnegativos);
        System.out.println("Mayor que 99: "+contMayor99);
    }
}
