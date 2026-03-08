package moises;
import java.util.Scanner;
public class DiscountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int age = sc.nextInt();

        if (age < 12) {
            System.out.println("Usted tiene un 50% de descuento. ");
        } else if (age >= 12 && age <= 25) {
            System.out.println("Usted tiene un 25% de descuento. ");
        } else {
            System.out.println("Usted no tiene descuento. ");
        }

        sc.close();
    }
}
