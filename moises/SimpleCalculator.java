package moises;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        char answer;
        do {
            try{
            System.out.println("MENU ");
            System.out.println("1. Suma ");
            System.out.println("2. Resta ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. Dividir ");
            System.out.println("0. Salir ");
            System.out.println("");
            System.out.print("Elija una opcion: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    suma(sc);
                    break;       
                case 2:
                    resta(sc);
                    break;
                case 3:
                    multiplication(sc);
                    break;
                case 4:
                    division(sc);
                    break;
                case 0:
                    System.out.println("Analizando....");
                    break;
                default:
                    System.out.println("[ERROR] Opcion invalida intenta una opcion valida. ");
                    break;
            }
            
            } catch (Exception e) {
                System.out.println("[ERROR] Solo se permiten numeros intente nuevamente. ");
                sc.nextLine();
            }
            System.out.println("SI[S] PARA CONTINUAR UTILIZANDO El PROGRAMA ");
            System.out.println("NO[N] PARA FINALIZAR EL PROGRAMA ");
            System.out.print("ELIJA UNA OPCION: ");
            answer = sc.next().charAt(0);
        }while(answer == 'S' || answer == 's');
        System.out.println("Finalizando programa....");

        sc.close();
    }
    static void suma(Scanner sc) {
        System.out.print("Ingrese el primer numero para sumar: ");
        int number1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero para sumar: ");
        int number2 = sc.nextInt();

        int result = number1 + number2;

        System.out.println("El resultado de la suma es: "+result);
    }
    static void resta(Scanner sc) {
        System.out.print("Ingrese el primer numero para sumar: ");
        int number1 = sc.nextInt();
        System.out.print("Ingrese el primer numero para restar: ");
        int number2 = sc.nextInt();

        int result = number1 - number2;

        System.out.println("El resultado de la resta es: "+result);
    }
    static void multiplication(Scanner sc) {
        System.out.print("Ingrese el primer numero para multiplicar: ");
        int number1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero para multiplicar: ");
        int number2 = sc.nextInt();

        int result = number1 * number2;

        System.out.println("El resultado de la multiplicacion es: "+result);
    }
    static void division(Scanner sc) {
        System.out.print("Ingresa el numero dividiendo: ");
        double number1 = sc.nextDouble();
        System.out.print("Ingresa el numero divisor: ");
        double number2 = sc.nextDouble();

        double result = number1 / number2;

        if (number1 == 0 || number2 == 0) {
            System.out.println("[ERROR] Intente nuevamente. ");
        }else{
            System.out.println("El resultado de la division es: "+result);
        }
    }
}
