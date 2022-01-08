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
public class Ejercicio14 {

    public enum DiaSemana{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};
    
        public static void main(String[] args) {
        
            DiaSemana hoy = DiaSemana.MARTES;
            DiaSemana dom = DiaSemana.DOMINGO;
            
                System.out.println("Hoy es "+hoy);
                System.out.println("Domingo es el dia numero "+dom.ordinal());
    }
}
