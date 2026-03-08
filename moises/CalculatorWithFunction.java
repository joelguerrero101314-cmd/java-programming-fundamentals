package moises;
import java.util.Scanner;

import ramses_rodriguez.multiplicationtable;
public class CalculatorWithFunction {
    static void menu (Scanner sc) {
        System.out.println("--- MENU --- ");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division ");
        System.out.println("0. Salir ");
        System.out.println();
    }
    static double sum(Scanner sc) {
        System.out.print("Ingrese el primer numero para sumar: ");
        double numberOne = sc.nextDouble();
        System.out.println();
        System.out.print("Ingrese el segundo numero para sumar: ");
        double numberTwo = sc.nextDouble();

        double result = numberOne + numberTwo;

        return result;
    }
    static double res(Scanner sc) {
        System.out.print("Ingrese el primer numero para restar: ");
        double numberOne = sc.nextDouble();
        System.out.println();
        System.out.print("Ingrese el segundo numero para restar: ");
        double numberTwo = sc.nextDouble();

        double result = numberOne - numberTwo;

        return result;
    }
    static int multiplicationtable(Scanner sc) {
        System.out.print("Ingrese el primer numero para multiplicar: ");
        int numberOne = sc.nextInt();
        System.out.println();
        System.out.print("Ingrese el segundo numero para multiplicar: ");
        int numberTwo = sc.nextInt();

        int result = numberOne * numberTwo;

        return result;
    }
    static double division(Scanner sc) {
        System.out.print("Ingrese el numero dividiendo: ");
        double numberOne = sc.nextDouble();
        System.out.println();
        System.out.print("Ingrese el numero divisior: ");
        double numberTwo = sc.nextDouble();

        double result = numberOne / numberTwo;

        if (numberTwo == 0) {
            System.out.println("[ERROR] No se puede dividir entre 0. ");
        } else {
            System.out.println("El resultado de la resta es: "+result);
        }

        return result;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {

            menu(sc);

            System.out.print("Seleccione una opcion: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    double resultOne = sum(sc);

                    System.out.println("El resultado de la suma es: "+resultOne);
                    break;
                case 2:
                   double resultTwo = res(sc);

                   System.out.println("El resultado de la resta es: "+resultTwo);
                    break;
                case 3:
                    double resultThree = multiplicationtable(sc);

                    System.out.println("El resultado de la multiplicacion es: "+resultThree);
                    break;
                case 4:
                    division(sc);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema... ");
                    break;
                default:
                    System.out.println("[ERROR] Opcion invalida. ");
                    break;
            }

        }while(option != 0);
            System.out.println("Hasta luego gracias por utilizar el rpograma. ");
        sc.close();
    }
    
}
