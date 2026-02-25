package JOSE_VILLAR;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // activamos el Scanner para la lectura de ingresado por el usuario 
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número para ver su tabla: ");
        int numero = entrada.nextInt();

        System.out.println("\n--- Tabla del " + numero + " ---");
         
        // utilizamos for para crear un bucle, lo cual me va a indicar i * el numero ingresado
        for (int i = 1; i <= 20; i++) {
            int resultado = numero * i;

            // Imprimimos el formato: numero x i = resultado
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // finalizamos el Scanner
        entrada.close();
    }
}
