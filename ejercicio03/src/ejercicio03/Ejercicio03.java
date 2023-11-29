/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int n;
        int m;
        int resultado = 0;
        
        System.out.println("Ingrese el primer valor");
        n = entrada.nextInt();
        System.out.println("Ingrese el segundo valor");
        m = entrada.nextInt();
        
        while (m > 0) {
            if (m % 2 !=0) {
                resultado = resultado + n;
            }
            n = n * 2;
            m = m / 2;
        }
        System.out.println("Resultado: " + resultado);
    }
    
}
