import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static final String RESET = "\u001B[0m";
    public static final String ORANGE = "\u001B[93m";
    public static final String CYAN = "\u001B[96m";
    public static final String GREEN = "\u001B[92m";
    public static final String MAGENTA = "\u001B[95m";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // número entre 1 y 100
        int guess = 0;

        System.out.println(MAGENTA + "¡Bienvenido a mi juego de adivinar el número!" + RESET);
        System.out.println(MAGENTA + "Acabo de escoger un número del 1 al 100, ¿Podrás adivinarlo?" + RESET);

        while (guess != numberToGuess) {
            System.out.print(MAGENTA + "Ingresa tu intento: " + RESET);
            guess = sc.nextInt();

            int diferencia = Math.abs(guess - numberToGuess);

            if (guess < numberToGuess) {
                if (diferencia <= 5) {
                    System.out.println(ORANGE + "¡Casi! Un poquito más alto." + RESET);
                } else {
                    System.out.println(ORANGE + "Demasiado bajo, intenta otra vez." + RESET);
                }

            } else if (guess > numberToGuess) {
                if (diferencia <= 5) {
                    System.out.println(CYAN + "¡Casi! Un poquito más bajo." + RESET);

                } else {
                    System.out.println(CYAN + "Demasiado alto, intenta otra vez." + RESET);
                }
                

            } else {
                System.out.println(GREEN + "¡Correcto! El número era " + RESET + numberToGuess);

            }
        }

        sc.close();

    }
}