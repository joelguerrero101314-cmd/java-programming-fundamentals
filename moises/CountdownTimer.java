package moises;
import java.util.Scanner;
public class CountdownTimer {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();

        for(int i = number; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
