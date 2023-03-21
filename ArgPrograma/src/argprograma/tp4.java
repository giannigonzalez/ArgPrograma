package argprograma;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class tp4 {

    public static void main(String[] args) {
        
        ordenNumeros();
        ordenNumerosInput();
        
    }
    
    private static void ordenNumeros(){
        
        //hacer un código de Java, el cual por parámetro ponga 3 números 
        //y una letra que represente ascendente o descendente y los muestre ordenado por tal criterio
        int num1 = 25;
        int num2 = 6;
        int num3 = 67;
        char orden = 'a';
        
        if (orden == 'a') {
            if (num1 <= num2 && num2 <= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else if (num1 <= num3 && num3 <= num2) {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            } else if (num2 <= num1 && num1 <= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else if (num2 <= num3 && num3 <= num1) {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            } else if (num3 <= num1 && num1 <= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        } else if (orden == 'd') {
            if (num1 >= num2 && num2 >= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else if (num1 >= num3 && num3 >= num2) {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            } else if (num2 >= num1 && num1 >= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else if (num2 >= num3 && num3 >= num1) {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            } else if (num3 >= num1 && num1 >= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }
        
    }
    
    private static void ordenNumerosInput(){
        
        //haga lo mismo, pero pero pidiendo los datos por input.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero.");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero.");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero.");
        int num3 = leer.nextInt();
        System.out.println("Elija un orden, ascendente o descendente. (a/d)");
        char orden = leer.next().charAt(0);
        
        if (orden == 'a' || orden == 'A') {
            if (num1 <= num2 && num2 <= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else if (num1 <= num3 && num3 <= num2) {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            } else if (num2 <= num1 && num1 <= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else if (num2 <= num3 && num3 <= num1) {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            } else if (num3 <= num1 && num1 <= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        } else if (orden == 'd' || orden == 'D') {
            if (num1 >= num2 && num2 >= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else if (num1 >= num3 && num3 >= num2) {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            } else if (num2 >= num1 && num1 >= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else if (num2 >= num3 && num3 >= num1) {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            } else if (num3 >= num1 && num1 >= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }else{
            System.out.println("La letra ingresada no es valida. Debe ser 'a' o 'd'.");
        }
        
    }
    
}
