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
public class Ejercicio24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double valorCompra, dto = 0, recargo = 0;
        
        char pago;
        
        System.out.print("Introduce el valor de la compra: ");
        valorCompra = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("Introduce el tipo de pago, c para contado o t para tarjeta");
        pago = sc.nextLine().charAt(0);
        
        if (pago == 'c'){
            dto = valorCompra * 0.05;
            valorCompra = valorCompra - dto;
            System.out.println("El descuento es: "+dto);
            System.out.println("El valor de la compra es: "+valorCompra);
        }else if (pago == 't') {
            recargo = valorCompra * 0.03;
            valorCompra = valorCompra + recargo;
             System.out.println("El recargo es: "+recargo);
             System.out.println("El valor de la compra es: "+valorCompra);
        }else System.out.println("Caracter incorrecto");
        
        
       
        
    }
}
