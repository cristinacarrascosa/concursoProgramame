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
public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un entero entre 1 y 12");
        num = sc.nextInt();
        
        if (num < 0 || num > 7){
            System.out.println("Número equivocado");
        } else if (num == 2) {
            System.out.println("Este mes tiene 28 días, 29 los años bisiestos");
        }else if (num != 2 && num == 4 || num == 6 || num == 9 || num == 11 ){
            System.out.println("Este mes tiene 30 días");
        }else  
            System.out.println("Este mes tiene 31 días");
        
        
    }
}
