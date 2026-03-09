package moises;
import java.util.Scanner;
public class BasicAtm {
    static int keep;
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        char asnwer;
        do {
            System.out.println("MENU");
            System.out.println("1. Depositar ");
            System.out.println("2. Retirar ");
            System.out.println("3. Consultar saldo ");
            System.out.println("0. Salir ");
            System.out.println("");
            System.out.print("Seleccione una opcion: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    deposit(sc);
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    CheckBalance(sc);
                    break;
                case 0:
                    System.out.println("Analizando...");
                    break;
                default:
                    System.out.println("[ERROR] Opcion invalida. ");
                    break;
            }

            System.out.print("Desea seguir continuando usando el cajero automatico(S/N): ");
            asnwer = sc.next().charAt(0);
        }while(asnwer == 'S' || asnwer == 's');
        System.out.println("Saliendo del sistema...");

        sc.close();
    }
    public static void deposit(Scanner sc) {
        System.out.print("Ingrese cuanto dinero quiere depositar: ");
        int deposit = sc.nextInt();
        keep = keep + deposit;

        System.out.println("Nuevo saldo disponible: "+keep);
    }
    public static void withDraw(Scanner sc) {
          System.out.println("Saldo disponible: "+keep);
          System.out.print("¿Cuanto saldo desea retirar?: ");
          int withdrawal = sc.nextInt();
          keep = keep - withdrawal;

          System.out.println("Saldo retirado correctamente. ");
          System.out.println("");
          System.out.println("Su nuevo saldo disponible es: "+keep);
    }
    public static void CheckBalance(Scanner sc) {
        System.out.println("Su saldo disponible es de: "+keep);
    }
}
