/*
 * Proyecto ConcursoProgramame - Archivo HolaMundo.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package concursoprogramame;

import java.util.Scanner;


public class HolaMundo {
    public static void main(String[] args) {
        int cantidad;
        Scanner sc = new Scanner(System.in);
        
        cantidad = sc.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Hola mundo.");
        }
    }
  
            

}
