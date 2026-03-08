package moises;
import java.util.Scanner;
public class GradeSimulatorVaidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int amount = 0;
        int note;

        while (true) {
            System.out.print("Ingrese una nota (0-100): ");
            note = sc.nextInt();

            if (note == -1) {
                break;
            }
        
            if (note < 0 || note > 100) {
                System.out.println("Nota invalida! Debe ser entre 0 Y 100. ");
            } else {
                sum = sum + note;
                amount++;
            }
        }
            if (amount > 0) {
                double averaga = sum / amount;
                System.out.println("Promedio final: " + averaga);
            } else {
                System.out.println("No ingresastes ninguna nota. ");
            }

            sc.close();
    }
}
