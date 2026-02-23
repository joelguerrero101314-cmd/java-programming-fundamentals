import java.util.Scanner;

public class CalculadoraSimple {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double num1, num2;

    System.out.print(
        "Calculadora Digital: \n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n");
    System.out.print("Elige la opcion que deseas seleccionando un número :");
    int opcion1 = read.nextInt();

    switch (opcion1) {
      case 1:
        System.out.print("Elige el primer valor a sumar: ");
        num1 = read.nextInt();
        System.out.print("Elige el segundo valor a sumar: ");
        num2 = read.nextInt();
        System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
        // read.close();
        break;

      case 2:
        System.out.print("Elige el primer valor a restar: ");
        num1 = read.nextInt();
        System.out.print("Elige el segundo valor a restar: ");
        num2 = read.nextInt();
        System.out.println("El resultado de la resta de " + num1 + " - " + num2 + " es: " + (num1 - num2));
        // read.close();
        break;

      case 3:
        System.out.print("Elige el primer valor a Multiplicar: ");
        num1 = read.nextInt();
        System.out.print("Elige el segundo valor a Multiplicar: ");
        num2 = read.nextInt();
        System.out.println("El resultado de la Multiplicación de " + num1 + " x " + num2 + " es: " + (num1 * num2));
        // read.close();
        break;

      case 4:
        System.out.print("Elige el primer valor a Dividir: ");
        num1 = read.nextInt();
        System.out.print("Elige el segundo valor a Dividir: ");
        num2 = read.nextInt();
        System.out.println("El resultado de la División de " + num1 + " / " + num2 + " es: " + (num1 / num2));
        // read.close();
        break;
      default:
        System.out.println("Vuelva a intentarlo !!!");
    }// end switch
    read.close();
  }// end main
}// end public class
