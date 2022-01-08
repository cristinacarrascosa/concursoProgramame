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
public class Ejercicio1_AlmacenarEnArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int negativos =0,positivos = 0,ceros=0;
        
        int []numeros = new int [10];
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Introduce número para la posición "+i);
            
            numeros[i]=sc.nextInt();
            
        }
        
        for (int numero : numeros) {
            
           if(numero < 0) negativos ++;
           else if(numero > 0) positivos ++;
           else ceros++;
        }
        
        System.out.println("Números negativos: "+negativos);
        System.out.println("Números postivos: "+positivos);
        System.out.println("Ceros: "+ceros);
    }
}
