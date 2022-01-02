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
public class EntradaScanner {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu edad, por favor");
        
        int edad = sc.nextInt();
        
        System.out.println("Introduce tu nombre, por favor");
        
        sc.nextLine();
        
        String nombre = sc.nextLine();
        
        
        
        System.out.println("Te llamas "+ nombre +  " y tienes "+edad + " años");
        
        sc.close();
    }
}
