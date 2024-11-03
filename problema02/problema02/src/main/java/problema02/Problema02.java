/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package problema02;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double gasto1, gasto2, gasto3;
        String nombreh1,nombreh2, nombreh3;
            
        System.out.println("Digite los gastos de su primer hijo"); 
        gasto1= entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Digite el nombre de su primer hijo"); 
        nombreh1= entrada.nextLine();
        System.out.println("Digite los gastos de su segundo hijo"); 
        gasto2= entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Digite el nombre de su segundo hijo"); 
        nombreh2= entrada.nextLine();   
        
        System.out.println("Digite los gastos de su tercer hijo"); 
        gasto3= entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Digite el nombre de su tercer hijo hijo"); 
        nombreh3= entrada.nextLine();
        
        double resultado= gasto1 + gasto2 + gasto3;

        System.out.println("Estos son los gastos totales de: "
                + nombreh1 +(", ")
                + nombreh2 + (" y ")
                + nombreh3 +":" + resultado);
        
    }
}
