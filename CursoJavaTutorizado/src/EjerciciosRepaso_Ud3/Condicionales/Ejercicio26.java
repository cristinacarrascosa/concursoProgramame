/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso_Ud3.Condicionales;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String usuario = "alumno";
        
        String contraseña = "123456";
        
        String respUsuario;
        
        String respContraseña;
        
        System.out.print("Introduce nombre usuario: ");
        respUsuario = sc.nextLine();
        
        System.out.print("Introduce contraseña:");
        respContraseña = sc.nextLine();
        
        if(respUsuario.equals(usuario) && respContraseña.equals(contraseña)){
            System.out.println("ACCESO PERMITIDO -- ESTÁS DENTRO DEL SISTEMA");
        }else if (!respUsuario.equals(usuario)){
            System.out.println("Usuario incorrecto!");
        }else if (!respContraseña.equals(contraseña)){
            System.out.println("Contraseña incorrecta!");
        }
    }
}
