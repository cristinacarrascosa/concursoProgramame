/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavatutorizado;

/**
 *
 * @author carra
 */
public class Calculo_Potencia {
    public static void main(String[] args) {
        int base, exponente;
        
        base = 5;
        exponente = 12;
        
        int resultado =(int)Math.pow(base, exponente);
        
        System.out.println(base+" elevado a "+exponente+" es igual a "+resultado);
    }
}
