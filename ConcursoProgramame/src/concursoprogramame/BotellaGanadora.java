/*
 * Proyecto ConcursoProgramame - Archivo BotellaGanadora.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package concursoprogramame;

import java.util.Scanner;


public class BotellaGanadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cuantos;
        int []botellas = null;
        int kilos;
        int n;
        int[] participantes;
        
        cuantos = sc.nextInt();
        
        
        participantes= new int[cuantos];
        
        for (int i = 0; i < cuantos; i++) {
            do {                
                n = sc.nextInt();
                 int cont = 0;
                 botellas[cont]= n;
                 cont ++;
            } while (n != 0);
        }
    }

}
