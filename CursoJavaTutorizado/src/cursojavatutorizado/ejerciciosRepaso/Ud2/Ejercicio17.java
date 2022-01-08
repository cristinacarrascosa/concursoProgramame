/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavatutorizado.ejerciciosRepaso.Ud2;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño del lado del triángulo");
        double lado = sc.nextDouble();
        
        double perimetro = lado * 3;
        double area = Math.pow(lado, 2) * (Math.sqrt(3)/4);
        
        System.out.println("Perímetro: "+perimetro);
        System.out.println("Área: "+area);
    }
}
