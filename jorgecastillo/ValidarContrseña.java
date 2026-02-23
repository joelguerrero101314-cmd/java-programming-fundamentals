import java.util.Scanner;

public class ValidarContrseña {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    String passwordCorrecto = "Panama26.";
    String passwordIngresado = "";
    System.out.print("Ingresa tu password para validar tu entrada :");
    while (!passwordIngresado.equals(passwordCorrecto)) {
      passwordIngresado = read.nextLine();
      if (passwordIngresado.equals(passwordCorrecto)) {
        System.out.println("Password Correcto!!!");
      } // end if
      else {
        System.out.println("Password incorrecto X X X");
        System.out.print("Vuelve a ingresar tu password:");

      }
    } // end while
  }// end main
}// end public class
