/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author carra
 */
public class Coche {
    
    //Atributos
    String color;
    String marca;
    int km;
    
    //Método
    public static void main(String [] args){
        // Creamos un objeto (coche1)
        Coche coche1 = new Coche();
        
        //Llenamos los atributos de coche1
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El kilometraje coche1 es: "+coche1.km);
        System.out.println("");
        
        
        //Creamos otro objeto
        Coche coche2 = new Coche();
        
        //Llenamos los atributos del coche2
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
        System.out.println("El color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El kilometraje coche2 es: "+coche2.km);
    }
    
}
