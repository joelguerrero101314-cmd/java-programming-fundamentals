import java.util.Scanner;

public class PromedioNotas {
  public static void main(String[] args) {
    double suma, prom, nota;
    int max, i;
    char go;

    boolean repeat = false;
    i = 1;
    suma = 0;
    Scanner read = new Scanner(System.in);

    while (repeat != true) { // while 1
      System.out.println("Calculo del Promedio de Calificaciones");
      System.out.print("Ingrese la cantidad de notas a promediar: ");
      max = read.nextInt();

      while (i <= max) { // while 2
        System.out.print("Ingresar nota " + i + " :");
        nota = read.nextDouble();
        suma = suma + nota;
        i += 1;
      } // end while 2

      prom = suma / max;
      System.out.print("El promedio de las notas es :" + prom + "\n");
      if (prom >= 70) {
        System.out.println("Estudiante Aprobado!!");
      } else {
        System.out.println("Estudiante Reprobado...");
      }

      System.out.print("Desea Continuar y/n ?:");
      go = read.next().charAt(0);
      go = Character.toLowerCase(go);

      if (go != 'y') {
        repeat = true;
      } // end if

      i = 1;
      prom = 0;
      suma = 0;

    } // end while 1

  }// end void main

}// end public class
