package jorgecastillo;

import java.util.Scanner;

public class PossitiveNegativeNumbers {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Hola introduce un Numero y te dire si es positivo o negativo: ");
        Integer numero = read.nextInt();

        if (numero > 0)
            System.out.println("EL NUMERO ES POSITIVO");
        else if (numero < 0)
            System.out.println("El numero es negativo");
        else
            System.out.println("El numero es igual a cero y mas nada");

    }
}
