package moises;
import java.util.Scanner;
public class NumberPositive {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("El numero ingresado es positivo. ");
        }else if (number < 0) {
            System.out.println("El numero ingresado es negativo. ");
        }else{
            System.out.println("El numero ingresado es 0. ");
        }
        sc.close();
    }
}
