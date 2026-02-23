import java.util.Scanner;

public class TablaMultiplicar {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.print("Introduce que tabla de Multplicar quieres ver :");
    int num = read.nextInt();
    System.out.println("Deseas ver la tabla del " + num);
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + num * i);
    }

  }
}
