package argprograma;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class ejercicio2 {
     
    public static void main(String[] args) {
        
        //2)Determinar si una persona pertenece al segmento de ingresos altos.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Pertenece al segmento de ingresos altos?");
        System.out.println("¿Cuanto es el ingreso mensual total de su hogar?");
        int ingresos = leer.nextInt();
        System.out.println("¿Cuantos vehiculos tiene con una antiguedad menor a 5 años?");
        int vehiculos = leer.nextInt();
        System.out.println("¿Cuantos inmuebles posee?");
        int inmuebles = leer.nextInt();
        System.out.println("¿Posee una embarcacion, aeronave de lujo o es titular de activos"
                + "sociertarios? (Responda S/N)");
        char embarcacion = leer.next().charAt(0);
        
        switch(embarcacion) {
            case 'S':
            case 's':
                if(ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3
                        || embarcacion == 'S' || embarcacion == 's'){
            
                    System.out.println("Usted pertenece al segmento de ingresos altos.");
            
                }else{
            
                    System.out.println("Usted no pertenece al segmento de ingresos altos.");
            
                }
                break;
            case 'N':
            case 'n':
                if(ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3){
            
                    System.out.println("Usted pertenece al segmento de ingresos altos.");
            
                }else{
            
                    System.out.println("Usted no pertenece al segmento de ingresos altos.");
            
                }
                break;
            default:
                System.out.println("Ingrese un caracter correcto. (S/N)");
        }
        
    }
    
}
