package moises;
import java.util.Scanner;
public class MathOptionMenu {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int answer;
        do {
            System.out.println("MENU");
            System.out.println("1. Suma ");
            System.out.println("2. Resta ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. Division ");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            int option = sc.nextInt();

            System.out.print("Desea continuar usando el programa(S/N): ");
            answer = sc.next().charAt(0);
        }while(answer == 'S' || answer == 's');
        System.out.println("Saliendo del programa...");
        sc.close();
    }
}
