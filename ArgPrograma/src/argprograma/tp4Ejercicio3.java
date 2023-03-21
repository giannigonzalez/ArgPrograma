package argprograma;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gianni
 */
public class tp4Ejercicio3 {

    public static void main(String[] args) {
        
        //Tome el ejercicio 2 de la clase 3, escriba en un archivo la lista
        //de los nombres tratados.
        String data = "Lautaro_Damian_Federico_Lucas_Pedro_Juan_Pablo_Kevin"
                + "_Marcos_Jorge";
        String filename = "C:/Users/U/Documents/NetBeansProjects/ArgPrograma/src/argprograma/nombres.txt";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
            System.out.println("El texto se ha escrito en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
    }
    
}
