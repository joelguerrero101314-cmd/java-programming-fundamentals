import java.util.Scanner;

public class ContadorRegresivo {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.print("Escribe un número para iniciar el conteo regresivo: ");
    int num = read.nextInt();
    while (num >= 0) {
      System.out.println("Cuenta regresiva en " + num);

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Delay Interrumpido");
      }

      num -= 1;
    }
    System.out.println("Fin del Conteo hacia atrás!!!");
  }
}
