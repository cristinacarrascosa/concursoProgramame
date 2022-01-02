/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavatutorizado.ejerciciosRepaso.Ud2;

/**
 *
 * @author carra
 */
public class Ejercicio7 {
    public static void main(String[] args) {
         int cantidad = 2000;
        double interes = 2.75;
        int retHac = 18;
        double beneficio, retencion, cantidadFinal;
        double tiempo = 0.5; // años

        beneficio = ((cantidad * interes) / 100) * tiempo;
        retencion = (beneficio * retHac) / 100;
        cantidadFinal = cantidad + beneficio - retencion;

        System.out.println("Cantidad inicial: " + cantidad);
        System.out.println("Cantidad final:   " + cantidadFinal);
        
        
        
    }
}
