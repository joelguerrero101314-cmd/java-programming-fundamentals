package moises;
import java.util.Scanner;
public class SumUpToN {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("La suma desde 1 hasta "+ number + " es " + sum);
        sc.close();
    }
}