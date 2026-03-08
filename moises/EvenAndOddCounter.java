package moises;
import java.util.Scanner;
public class EvenAndOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = -1;
        int odd = 0;
        int pear = 0;
        while(number != 0) {

            System.out.print("Ingrese numeros para analizar: ");
            number = sc.nextInt();

        if (number != 0) {
            if (number % 2 == 0) {
                pear++;
            } else {
                odd++;
            }
            
        }
            System.out.println("Pares: "+pear);
            System.out.println("Impares: "+odd);
        }
            System.out.println("Saliendo del sistema...");

        sc.close();
    }
}
