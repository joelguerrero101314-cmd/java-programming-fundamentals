import java.util.Scanner;

public class SumarHastaN {
  public static void main(String[] args) {
    int sum = 0;
    Scanner read = new Scanner(System.in);
    System.out.print("introduce un Número para sumar N veces :");
    int num = read.nextInt();

    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    System.out.println("El resultado es :" + sum);

  }

}
