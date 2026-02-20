package JOSE_VILLAR;

import java.util.Scanner;

public class NumberPositives {

    public static void main(String[] args) {
        
        // incializamos el Scanner para leer los numeros ingresados 
        Scanner Digito = new Scanner(System.in);

        System.out.print("Ingresa un número para analizar: ");
        
        // aplicamos el Double para que funcione con decimal 
        double numero = Digito.nextDouble();

        // Aqui tenemos estructura de desiciones del programa
        if (numero > 0) {
            System.out.println("El número " + numero + " es POSITIVO.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es NEGATIVO.");
        } else {
            System.out.println("El número es CERO.");
        }

        // Cerramos el Scanner 
        Digito.close();
    }
}
