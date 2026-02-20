package ramses_rodriguez;
import java.util.Scanner;

public class NumberPositive{

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
       

        System.out.println("Q xopa bloc indicame un numero entero");
        System.out.print("Digita el numero: ");
        int number = keyboard.nextInt();

        if ( number ==0){
            System.out.println("el numero es cero");
        } else if (number % 2 == 0){
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
        keyboard.close();

        }
        }
