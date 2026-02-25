package moises;
import java.util.Scanner;
public class ValidatePassword {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        String password;
        do {

            System.out.print("Ingrese el password correcto: ");
            password = sc.next();

            if (password.equals("Admin")) {
                System.out.println("Password correcto ");
            }else{
                System.out.println("Password incorrecto ");
            }
            
        }while(! password.equals("Admin"));

        sc.close();
    }
}
