/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrascosa.cristina.arrays;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio2_MediaEnPosicionesParesDelArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int media = 0;
        
        int pares = 0;
        
        int [] numeros = new int [10];
        
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Introduce número para la posición "+i);
            
            numeros[i]=sc.nextInt();
            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            
            if(i % 2 == 0 & i!=0) {
                
                pares ++;
                media = media + numeros[i];
                
            }
                
            
        }
        
        System.out.println("La media de las posiciones pares del array es: "+media/pares);
    }
}
