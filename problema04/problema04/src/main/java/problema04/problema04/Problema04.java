/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package problema04.problema04;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double cpu, teclado, raton, pantalla;
        String cliente;
        
        System.out.println("Escriba el nombre completo del cliente");
        cliente = entrada.nextLine();
        
        System.out.println("Escriba el costo del cpu");
        cpu = entrada.nextDouble();
        
        System.out.println("Escriba el costo de su teclado");
        teclado = entrada.nextDouble();
        
        System.out.println("Escriba el costo del raton");
        raton = entrada.nextDouble();
        
        System.out.println("Escriba el costo de su pantalla");
        pantalla = entrada.nextDouble();
        
        System.out.println(pantalla + raton + teclado + cpu);
        
        System.out.printf(
        "Reporte:\n"
        +"Nombres de cliente: %s\n"
        + "Valores Iniciales: \n"
        + "cpu: $ "
        + "%.2f\nteclado: $ "
        + "%.2f\nraton: $ "
        + "%.2f\npantalla: $ "
        + "$%.2f\n\nValor a cancelar:",        
                    cliente,
                    cpu,
                    teclado,
                    raton,
                    pantalla);
        System.out.println(pantalla + raton + teclado + cpu);   
    }
}
