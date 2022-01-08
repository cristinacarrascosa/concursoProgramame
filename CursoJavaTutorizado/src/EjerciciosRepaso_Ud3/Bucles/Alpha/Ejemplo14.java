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
public class Ejemplo14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        int cont = 0;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Introduce un valor: ");
            num = sc.nextInt();
            if ( num % 10 == 0){
                
                cont ++;
                
            }
        }
        System.out.println("Has introducido "+cont+" múltiplos de 10");
        
    }
}
