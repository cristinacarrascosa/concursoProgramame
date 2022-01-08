/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrascosa.cristina.arrays;

/**
 *
 * @author carra
 */
public class Ejemplo_Arrays {
    
    public static void main(String[] args) {
        
        int [] valores = {15,7,1500,9,-5};
        
        String [] nombre_personas ={"Juan", "maria", "Antonio","Laura"};
       /* for (int i = 0; i < valores.length; i++) {
            
            System.out.print(valores[i]+ " ");
            
        }*/
       
        for (int elemento : valores) {
            
            System.out.println(elemento);
            
        }
        for (String nombre_persona : nombre_personas) {
            
            System.out.println(nombre_persona);
            
        }
    }
}
