/*
 * Proyecto ConcursoProgramame - Archivo PerimetroDeUnRectangulo.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package concursoprogramame;

import java.util.Scanner;

public class PerimetroDeUnRectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int per;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a >=0 && b >= 0) {
                per = (a + b) * 2;
                System.out.println(per);
            }

        } while (a >= 0 && b >= 0);
    }

}
