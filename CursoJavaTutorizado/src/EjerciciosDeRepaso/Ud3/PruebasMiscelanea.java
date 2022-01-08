/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeRepaso.Ud3;
import java.util.*;
/**
 *
 * @author carra
 */
public class PruebasMiscelanea {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        int numero = rnd.nextInt(1000);
        
        System.out.println(numero);
        
        rnd.setSeed(new Date().getTime());
        
        int numero2 = rnd.nextInt(1000);
        
        System.out.println(numero2);
        
        GregorianCalendar fecha=new GregorianCalendar();
        
        int diaHoy = fecha.get(GregorianCalendar.DAY_OF_MONTH);
        int mesHay = fecha.get(GregorianCalendar.MONTH)+1;
        int anyoHoy = fecha.get(GregorianCalendar.YEAR);
        
        // Imprimir con formato
        System.out.printf("%d/%d/%d \n\n", diaHoy,mesHay,anyoHoy);
    }
}
