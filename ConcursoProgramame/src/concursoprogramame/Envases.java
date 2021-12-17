/*
 * Proyecto ConcursoProgramame - Archivo Envases.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package concursoprogramame;

import java.util.Scanner;


public class Envases {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int casos;
        
        casos= lector.nextInt();
        
        for (int i = 0; i < casos; i++) {
            int neto = lector.nextInt();
            int total = lector.nextInt();
            
            int resultado = total -neto;
            System.out.println(resultado);
        }
    }

}
