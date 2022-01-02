/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrascosa.cristina.entradaSalida;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class RaizScanner {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        
        int numero = sc.nextInt();
        
        System.out.println("La raíz es "+Math.sqrt(numero));
    }
}
