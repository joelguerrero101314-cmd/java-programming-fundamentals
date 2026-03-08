package moises;
import java.util.Scanner;
public class TemperatureConverser {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Celsius a fahrenheit ");
        System.out.println("2. Fahrenheit a celsius ");
        System.out.println();

        System.out.print("Seleccione una opcion: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.print("Ingrese la temperatura en celsius: ");
                double celsius = sc.nextDouble();

                double fahrenheit = (celsius * 9/5 ) + 32;

                System.out.println("La temperatura en fahrenheit es: "+fahrenheit);
                break;
            case 2:
                System.out.print("Ingrese la temperatura en fahrenheit: ");
                double fahrenheitTemp = sc.nextDouble();

                double celsiusTemp = (fahrenheitTemp - 32 ) * 5/9;

                System.out.println("La temperatura en celsius es: "+celsiusTemp);
                break;
            default:
                System.out.println("[ERROR] Opcion invalida. ");
                break;
        }

        sc.close();
    }
}
