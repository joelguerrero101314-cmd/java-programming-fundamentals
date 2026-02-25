import java.util.Scanner;

public class NumberPositive {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("ingresa un numero entero");
        int number = keyboard.nextInt();

        if (number > 0) {
            System.out.println("el numero es positivo");
        } else if (number < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es cero");
        }
    }
}
