package ClasesYObjetos;

import javax.swing.JOptionPane;

public class MainOperacion {

    public static void main(String[] args) {

        // Pedimos números al usuario
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        // Creamos objeto
        Operacion op = new Operacion();

        op.sumar(num1, num2);
        op.restar(num1, num2);
        op.dividir(num1, num2);
        op.multiplicacion(num1, num2);

        System.out.println("La suma es: " + op.sumar(num1, num2));
        System.out.println("La resta es: " + op.restar(num1, num2));
        System.out.println("La multiplicación es: " + op.multiplicacion(num1, num2));
        System.out.println("La división es: " + op.dividir(num1, num2));

    }
}
