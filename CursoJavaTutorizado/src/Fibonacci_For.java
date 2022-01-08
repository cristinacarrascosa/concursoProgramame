
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carra
 */
public class Fibonacci_For {

    public static void main(String[] args) {

        int numTerm, v1 = 1, v2 = 1, aux, cont;
        Scanner lector = new Scanner(System.in);
        
        System.out.println(" Términos de la serie Fibonacci?");
        numTerm = lector.nextInt();
        
        System.out.print("1,1");
        for (cont = 2; cont < numTerm; cont++) {
            aux = v2;
            v2 += v1;
            v1 = aux;
            System.out.print("," + v2);
        }
        System.out.println();
    }
}
