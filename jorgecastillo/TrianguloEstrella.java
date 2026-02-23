import java.util.Scanner;

public class TrianguloEstrella {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.print("Introduzca un numero para el triangulo de estrellas: ");
    int num = read.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();

    }

  }
}
