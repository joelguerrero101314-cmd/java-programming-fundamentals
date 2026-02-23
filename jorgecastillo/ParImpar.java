import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    // int number = 0;

    System.out.print("Ingresa un número para saber si es Par o Impar :");
    int number = read.nextInt();
    if (number % 2 == 0) {
      System.out.println("El número es par");
    } else {
      System.out.println("El número es impar");
    }

  }
}
