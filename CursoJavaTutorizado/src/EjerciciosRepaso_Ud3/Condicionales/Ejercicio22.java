/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso_Ud3.Condicionales;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double art1, art2, art3, subtotal, total, totalIVA, dto;

        int iva = 21;

        System.out.print("Introduce el precio del artículo 1: ");
        art1 = sc.nextDouble();

        System.out.print("Introduce el precio del artículo 2: ");
        art2 = sc.nextDouble();

        System.out.print("Introduce el precio del artículo 3: ");
        art3 = sc.nextDouble();

        subtotal = art1 + art2 + art3;

        if (subtotal > 50) {
            System.out.println("Te has gastado más de 50 euros, obtines un 5% de descuento");
            System.out.println("Descuento extra: "+(dto = subtotal * 5 / 100));
            subtotal = subtotal - dto;
        }
        totalIVA = subtotal * iva / 100;
        total = subtotal + totalIVA;
        
        System.out.println("Subtotal: "+subtotal);
        System.out.println("IVA: "+totalIVA);
        System.out.println("Total: "+total);

    }
}
