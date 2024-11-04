/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package problema05.problema05;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Problema05 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double netflix, youtube, dropbox, spotify;
        double desc1, desc2, desc3;
        
        System.out.println("Escriba el costo de Netflix:");
        netflix = entrada.nextDouble();
        
        System.out.println("Escriba el costo de Youtube Premium:");
        youtube = entrada.nextDouble();
        
        System.out.println("Escriba el costo de Dropbox:");
        dropbox = entrada.nextDouble();
        
        System.out.println("Escriba el costo de Spotify:");
        spotify = entrada.nextDouble();
        
        desc1= netflix * 0.23;
        desc2= youtube * 0.23;
        desc3= dropbox * 0.45;
        double valorT= desc1 + desc2 + desc3 + spotify;
        System.out.println("El valor total a cancelar por todo es de:"
        + valorT );
    }
}
