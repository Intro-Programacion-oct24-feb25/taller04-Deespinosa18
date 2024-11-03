/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package problema01.problema01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double area;
        double base;
        System.out.println("Escriba el area del triangulo a calcular");
        area= entrada.nextDouble();
        System.out.println("Escriba la base del triangulo a calcular");
        base= entrada.nextDouble();
        
        double resultado = (area* base)/2;
        System.out.println(resultado);
    }
}
