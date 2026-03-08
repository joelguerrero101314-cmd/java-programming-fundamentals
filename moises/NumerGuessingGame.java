package moises;
import java.util.Scanner;
public class NumerGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entre (1-100) para adivinar: ");
        int attempts = sc.nextInt();

        int attempesTry;

    
        while(attempts <= 100 )
            System.out.println("Has adivinado el numero: "+attempts);
            attempesTry++;

            attempts++;

            
        sc.close();
    }
}
