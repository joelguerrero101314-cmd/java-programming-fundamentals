package moises;
import java.util.Scanner;
public class passwordValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        while (counter <= 3) {
            
            System.out.print("Ingrese la contraseña correcta: ");
            String password = sc.next();

            if (password.equals("Admin")) {
                System.out.println("Acceso concedido. ");
                break;
            }else{
                System.out.println("[ERROR]Acceso denegado. ");
                counter++;
            }
        }
            if (counter > 3) {
                System.out.println("[ERROR]Cuenta bloqueada. ");
            }

        sc.close();
    }
}
