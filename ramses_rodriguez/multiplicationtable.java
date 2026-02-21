package ramses_rodriguez;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Que tabla deseas ver ");
        int number = keyboard.nextInt();
        System.out.println("dale un limite a la tabla");
        int limit = keyboard.nextInt();

        System.out.println("\n -- tabla del " + number + " --");

        for (int i = 1; i <= limit; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }
}
