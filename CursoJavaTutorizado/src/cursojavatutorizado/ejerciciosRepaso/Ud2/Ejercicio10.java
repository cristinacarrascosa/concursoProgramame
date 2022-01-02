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
public class Ejercicio10 {

    public static void main(String[] args) {
        
        int a = 2;
        int b = 4;
        int res;
        
        res = -a + 5 % b - a * a;
        System.out.println("–a + 5 % b – a * a = "+res);
        
        res = 5 + 3 % 7 * b * a - b % a;
        System.out.println("5 + 3 % 7 * b * a – b % a = "+res);
        
        res = (a + 1)*(b + 1) - b/a;
        System.out.println("(a + 1) * (b + 1) – b / a = "+res);
    }
}
