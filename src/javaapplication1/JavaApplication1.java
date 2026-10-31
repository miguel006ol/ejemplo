/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author SCIS2-10
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner input = new Scanner (System.in);
       System.out.print("Digite la cantidad de empleados: ");
       int cantidadEmpleado = input.nextInt();
       
        String nombre;
        int diasTrabajados;
        double pagoDiario;
        double pagototal;
        for (int i = 1; i < cantidadEmpleado; i++) {
            System.out.print("Digite nombre del empleado: ");
            input.next();
            nombre = input.nextLine();
            System.out.println("Digite los dias trabajados: ");
            diasTrabajados = input.nextInt();
            System.out.println("Digite su pago diario: ");
            pagoDiario = input.nextDouble();
            pagototal = diasTrabajados * pagoDiario;
            System.out.println("Sr " + nombre + " se debe pagar: " + pagototal);
           
                
  
        }
        
    }
    
}
