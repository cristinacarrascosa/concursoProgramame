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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        int cantInicial = 2000;
        
        double intAnual = 2.75;
        
        double beneficio;
        
        double retencionHacienda = 18;
        
        double tiempo = 0.5;
        
        double cantidadFinal;
        
        // Operaciones 
        beneficio = (cantInicial * intAnual/100)*tiempo;
        
        retencionHacienda = cantInicial * retencionHacienda/100;
        
        cantidadFinal = cantInicial + beneficio- retencionHacienda;
        
        System.out.println("Cantidad inicial: "+cantInicial);
        System.out.println("Beneficio: "+ beneficio);
        System.out.println("Retención Hacienda: "+retencionHacienda);
        System.out.println("Líquido a percibir: "+cantidadFinal);
        
    }
}
