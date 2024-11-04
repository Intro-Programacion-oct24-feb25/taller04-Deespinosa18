/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package problema03.problema03;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        String nCompletos, direccion;
        double costoM, nMinutos;
        
        System.out.println("Nombres completos:");
        nCompletos = entrada.nextLine();
        
        System.out.println("Escriba su direccion:");
        direccion = entrada.nextLine();
        
        System.out.println("Escriba el costo por minuto");
        costoM= entrada.nextDouble();
        
        System.out.println("Escriba el numero de minutos consumidos");
        nMinutos= entrada.nextDouble();
        
        double valorCancelar= costoM * nMinutos;
        System.out.printf("Reporte: \nNombres completos:"
        + " %s\n\tDireccion: %s\n"
        + "Costo por minuto: %.2f\n\tNumero de minutos consumidos: "
        + "%.2f\n\t\tValor a cancelar: %.2f\n",
                nCompletos,
                direccion,
                costoM,
                nMinutos,
                valorCancelar);
        
    }
}
