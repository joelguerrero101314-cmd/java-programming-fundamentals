package moises;
import java.util.Scanner;
public class NumbersBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int major = Integer.MIN_VALUE;
        int minor = Integer.MAX_VALUE;

        for(int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + " :");
            int numer = sc.nextInt();

            if (numer > major) {
                major = numer;
            }
            if (numer < minor) {
                minor = numer;
            }
        }

        System.out.println("El numero mayor es: "+major);
        System.out.println("El numero menor es: "+minor);

        sc.close();
    }
}
