package moises;
import java.util.Scanner;
public class ImprovedRatingSystem {
    static int category;
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        RequestNumber(sc);

        switch (category) {
            case 10:
            case 9:
                System.out.println("Excelente ");
                break;
            case 8:
                System.out.println("Bueno ");
                break;
            case 7:
                System.out.println("Regular ");
                break;
            default:
                System.out.println("Reprobado ");
                break;
        }

        sc.close();
    }
    public static void RequestNumber(Scanner sc) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + " para calcular el promedio: ");
            sum = sum + sc.nextInt();
            int averaga = sum / 5;
            category = averaga / 10;
        }
            System.out.println("Promedio: " +sum );
    }
}