/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursoprogramame;

import java.util.Scanner;


public class QueLadoDeLaCalle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
            
            if (n % 2 == 0 && n !=0) {
                System.out.println("DERECHA");
            } else if(n % 2 !=0){
                System.out.println("IZQUIERDA");
            }

        } while (n != 0);

    }

}
