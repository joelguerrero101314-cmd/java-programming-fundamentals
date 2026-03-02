package moises;
import java.util.Scanner;

public class StarTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();
        
        System.out.println("Numero ingresado: " + number);  // Debug
        
        for(int f = 1; f <= number; f++) {
           System.out.println("Fila " + f);
            
            for(int e = 1; e <= f; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
