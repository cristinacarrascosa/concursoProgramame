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
public class Ejercicio6 {
    public static void main(String[] args) {
        double precio = 85.00;
        double rebaja = 0.15;
        double preciofinal;
        
        rebaja = precio * rebaja;
        preciofinal = precio - rebaja;
        
        
        
        System.out.println("Precio inicial: "+precio);
        System.out.println("Rebaja: "+rebaja);
        System.out.println("Precio final: "+preciofinal);
       
        
        
    }
}
