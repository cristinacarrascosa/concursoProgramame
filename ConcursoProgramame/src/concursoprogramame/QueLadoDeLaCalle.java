/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursoprogramame;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class QueLadoDeLaCalle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = null;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Dime número");
            num[i]= sc.nextInt();
        }
        
        for (int i : num) {
            if ( i % 2 == 0){
                System.out.println("DERECHA");
            }else {
                System.out.println("IZQUIERDA");
            }
        }

        
    }

}
