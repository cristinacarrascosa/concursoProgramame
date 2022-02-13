/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author carra
 */
public class Operacion {

    //Atributos
    //Métodos void no retornan valores
    //Método para sumar ambos números
    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    //Metodo para restar ambos números
    public int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    //Método para multiplicar ambos números
    public int multiplicacion(int numero1, int numero2) {
        int multiplicación = numero1 * numero2;
        return multiplicación;
    }

    //Método para dividir
    public int dividir(int numero1, int numero2) {
        int division = numero1 / numero2;
        return division;
    }

    // Método para imprimir
}
