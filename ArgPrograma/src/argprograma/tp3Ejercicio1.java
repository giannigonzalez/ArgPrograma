package argprograma;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class tp3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //a)Dado un String y una letra, que cuente la cantidad de apariciones
        //de la letra en el String.
        int contador = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas veces aparece la letra en la palabra?");
        System.out.println("Ingrese la palabra");
        String p = leer.nextLine();
        System.out.println("Ingrese la letra");
        char l = leer.next().charAt(0);

        String palabra = p.toUpperCase();
        char letra = Character.toUpperCase(l);

        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.charAt(i) == letra) {

                contador++;

            }

        }

        System.out.println("La letra " + l + " aparece " + contador + " veces.");
        
        //b)Dados 3 números y un orden (ascendente o descendente) que ordene los mismos
        //y los retorne en un vector de 3.
        
        boolean orden_asc = false;

        int []vectorA = {800,0,10};

        int num1=0, num2=0,num3=0, aux1=0, aux2=0, mayor=0;

        num1 = vectorA[0];

        num2 = vectorA[1];

        num3 = vectorA[2];

        System.out.println(num1+" " + num2+" " + num3);

        if ((num1 > num2) && (num1 > num3)) {

            mayor=num1;

        if (num2 > num3) {

            aux1=num2;

            aux2=num3;

        }else{

            aux1=num3;

            aux2=num2;

        }

        }else{

        if ((num2 > num3) && (num2 > num1)) {

            mayor=num2;

        if (num1 > num3) {

            aux1=num1;

            aux2=num3;

        }else {

            aux1=num3;

            aux2=num1;

        }

        }else {

            mayor=num3;

        if (num2 > num1) {

            aux1=num2;

            aux2=num1;

        }else {

            aux1=num1;

            aux2=num2;

        }

        }

        }

        System.out.println("El mayor es: "+mayor);

        int vecOrdenado [] = new int[3];

        if (orden_asc) {

            vecOrdenado[0]=mayor;

            vecOrdenado[1]=aux1;

            vecOrdenado[2]=aux2;

        }else {

            vecOrdenado[0]=aux2;

            vecOrdenado[1]=aux1;

            vecOrdenado[2]=mayor;

        }

        for (int i=0; i< vecOrdenado.length; i++ ) {

            System.out.println(vecOrdenado[i]+"-");

        }
        
        //Genere una clase, utilice el método Split para separar una lista
        //de 10 nombres tomados de una variable, luego muestrelo por consola
        
        String nombres = "Lautaro_Damian_Federico_Lucas_Pedro_Juan_Pablo_Kevin"
                + "_Marcos_Jorge";
        
        String[] separado = nombres.split("_");
        System.out.println(separado);
    }

}
