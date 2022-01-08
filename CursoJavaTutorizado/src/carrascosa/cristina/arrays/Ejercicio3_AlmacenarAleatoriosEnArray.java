/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrascosa.cristina.arrays;

/**
 *
 * @author carra
 */
public class Ejercicio3_AlmacenarAleatoriosEnArray {

    public static void main(String[] args) {
        
        int []aleatorios = new int[100];
        
        for (int i = 0; i < aleatorios.length; i++) {
            
            aleatorios[i] = (int)(Math.random()*100)+1;
            
        }
        
        for (int numero : aleatorios) {
            
            System.out.print(numero+" ");
        }
    }
}
