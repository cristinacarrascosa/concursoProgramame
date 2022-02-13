
package Paquete1;


public class Clase2 {
    
    public static void main(String[] args) {
        
        Clase1 objeto1 = new Clase1();
        
        objeto1.setEdad(15);
        
        System.out.println("La edad es "+objeto1.getEdad());
        
        objeto1.setNombre("Cristina");
        System.out.println("Mi nombre es "+objeto1.getNombre());
    }
}
