package argprograma;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class ejercicio1 {

    public static void main(String[] args) {
        
        //a)Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.
        
        int a = 5, b = 14, i = a, n = a, x = a;
        
        while(i <= b){
            
            System.out.println("Numeros de menor a mayor = " + i);
            i++;
            
        }
        
        //b) A lo anterior, solo muestre los números pares
        
        while(n <= b){
            
            if(n % 2 == 0){
                
                System.out.println("Numeros pares = " + n);
                
            }
            
            n++;
            
        }
        
        //c)A lo anterior, con una variable extra, elija si se deben mostrar los números 
        //pares o impares

        System.out.println("Elija ver numeros pares o impares (P/I)");
        Scanner leer = new Scanner(System.in);
        char eleccion = leer.next().charAt(0);
        
        if(eleccion == 'P' || eleccion == 'p'){
            
            while(x <= b){
            
                    if(x % 2 == 0){
                
                        System.out.println("Numeros pares = " + x);
                
                    }
            
                    x++;
            
            }
            
        }else if(eleccion == 'I' || eleccion == 'i'){
            
            while(x <= b){
            
                    if(x % 2 != 0){
                
                        System.out.println("Numeros impares = " + x);
                
                    }
            
                    x++;
            
            }
            
        }else{
            
            System.out.println("Error, eliga 'P' para pares e 'I' para impares.");
            
        }
        
        //d)Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden.
        
        for(int z = 14; z >= a; z--){
            
            if(z % 2 == 0){
                
                System.out.println("Numeros pares invertidos = " + z);
                
            }
            
        }
        
    }
    
}
