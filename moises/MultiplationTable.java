package moises;
import java.util.Scanner;
public class MultiplationTable {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        char answer = 's';
        while (answer == 'S' || answer == 's') {
            
            System.out.print("Ingrese un numero: ");
            int number = sc.nextInt();

            int i = 1;
            while(i <= 12) {
                System.out.println(number + "x" + i + "=" + (i * number) );
                i++;
            }
            System.out.print("¿Desea ver otra tabla?(S/N): ");
            answer = sc.next().charAt(0);
        }
        System.out.println("Saliendo del programa...");
        sc.close();
    }
}
