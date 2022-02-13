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
public class Persona {
    
    // Atributos
    String nombre;
    int edad;
    String dni;
    
    //Métodos
    
    // Método constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maratón");
    }
    public void correr(int km){
        System.out.println("He corrido "+km+" kilómetros");
    }
    
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
}
