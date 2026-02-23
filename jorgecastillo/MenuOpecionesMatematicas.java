import java.util.Scanner;

public class MenuOpecionesMatematicas {
  public static void main(String[] args) {
    Boolean exit1 = false;
    double num1, num2, suma, resta, mult;
    Scanner read = new Scanner(System.in);

    while (exit1 != true) {
      System.out.print(
          "Menú de Operaciones a realizar\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Salir\nElige la opcion que quieras: ");
      int option = read.nextInt();
      switch (option) {
        case 1:
          System.out.print("Ingresa primer valor a sumar:");
          num1 = read.nextDouble();
          System.out.print("Ingresa segundo valor a sumar:");
          num2 = read.nextDouble();
          suma = num1 + num2;
          System.out.println();
          System.out.println("La suma es: " + suma);
          break;
        case 2:
          System.out.print("Ingresa primer valor a restar:");
          num1 = read.nextInt();
          System.out.print("Ingresa segundo valor a restar:");
          num2 = read.nextDouble();
          resta = num1 - num2;
          System.out.println();
          System.out.println("La resta es: " + resta);
          break;

        case 3:
          System.out.print("Ingresa primer valor a  multiplicar:");
          num1 = read.nextDouble();
          System.out.print("Ingresa segundo valor a multiplicar:");
          num2 = read.nextDouble();
          mult = num1 * num2;
          System.out.println();
          System.out.println("La Multiplicación es: " + mult);
          break;

        case 4:
          exit1 = true;
          break;

        default:
          System.out.println();
          System.out.print("****Opción no valida, intente de nuevo\n\n");
          break;
      }// end switch

    } // end while
    System.out.println();
    System.out.print("Gracias por Jugar, hasta Luego!!!");
  }// end void main

}// end public class
