package moises;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();

        boolean prime = true;

        if (number < 2) {
            prime = false;
        }

        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(number + " Es un numero primo. ");
        } else {
            System.out.println(number + " No es un numero primo. ");
        }
        sc.close();
    }
}
