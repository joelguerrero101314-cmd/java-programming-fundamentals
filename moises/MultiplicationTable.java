package moises;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int tab = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(tab + "x" + i + "=" + (tab * i));
        }
        sc.close();
    }
}
