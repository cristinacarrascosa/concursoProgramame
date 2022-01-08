/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso_Ud3.Bucles.Alpha;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Introduce a y b: ");
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i < b; i++) {

            if (i >= 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("OTRA FORMA DE HACERLO");
        for (int i = Math.max(0, a); i <= b; i++) {
            System.out.println(i);
        }
    }
}
