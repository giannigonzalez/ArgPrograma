package argprograma;

/**
 *
 * @author Gianni
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class tp4Ejercicio2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        suma();
        sumaOMult();
        
    }
    
    private static void suma() throws FileNotFoundException, IOException{
        
        //Haga un main donde por párametro envíe la ruta de un archivo. Ese
        //archivo debe contener números. El programa debe escribir por consola
        //la súma de esos números.
        //los números son 40, 23, 65, 12, 43
        File ruta = new File("C:/Users/U/Documents/NetBeansProjects/ArgPrograma/src/argprograma/numeros.txt");
        BufferedReader lector = new BufferedReader(new FileReader(ruta));
        String linea;
        int suma = 0;
        while ((linea = lector.readLine()) != null) {
            int numero = Integer.parseInt(linea.trim());
            suma += numero;
        }
        lector.close();
        System.out.println("La suma de los numeros en el archivo es: " + suma);
        
    }
    
    private static void sumaOMult() throws FileNotFoundException, IOException{
        
        //Al programa anterior agreguele un parámetro para que la operación
        //pueda ser suma o multiplicación
        File ruta = new File("C:/Users/U/Documents/NetBeansProjects/ArgPrograma/src/argprograma/numeros.txt");
        BufferedReader lector = new BufferedReader(new FileReader(ruta));
        String linea;
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desea sumar o multiplicar los numeros? (s/m): ");
        String opcion = scanner.nextLine().toLowerCase();
        while ((linea = lector.readLine()) != null) {
            int numero = Integer.parseInt(linea.trim());
            if (opcion.equals("s") || opcion.equals("S")) {
                resultado += numero;
            } else if (opcion.equals("m") || opcion.equals("M")) {
                numero *= numero;
                resultado = numero;
            } else {
                System.out.println("Opción invalida.");
                return;
            }
        }
        lector.close();
        System.out.println("El resultado de la operación es: " + resultado);
        
    }
}
