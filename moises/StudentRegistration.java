package moises;
import java.util.Scanner;
public class StudentRegistration {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[5];
        int[][] notes = new int[5][3];

        int option = 0;
        do {
            menu();
            System.out.print("Seleccione una opcion: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Registrar estudinates. ");

                    int sum = 0;

                    for(int i = 0; i < students.length; i++) {
                        System.out.print("Estudiante " + (i + 1) + " :");
                        students[i] = sc.next();
                        
                        sum = 0; 

                        for(int j = 0; j < notes[i].length; j++) {
                        System.out.print("Ingrese la nota " + (j + 1) + " :");
                        notes[i][j] = sc.nextInt();

                        sum += notes[i][j];
                    }
                    double averaga = (double) sum / notes[i].length;
                    System.out.println("Promedio de " + students[i] + " :" + averaga); 
                }

                    break;
                case 2:
                    System.out.println("Estudiantes registrados. ");

                    for(int i = 0; i < students.length; i++) {
                        System.out.println("Estudiante registrados: " + students[i]);

                        sum = 0;
                        for(int j = 0; j < notes[i].length; j++) {
                            System.out.println(" Nota " + (j + 1) + ": " + notes[i][j]);
                            sum += notes[i][j];
                        }

                        double averaga = sum / notes[i].length;
                        System.out.println(" Promedio: " + averaga);
                        System.out.println("-----------");
                    }
                    
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("[ERROR] Opcion invalida. ");
                    break;
            }

        }while(option != 0);
        System.out.println("Hasta luego gracias por utilizar el programa.");
        sc.close();
    }
    static void menu() {
        System.out.println("MENU");
        System.out.println("1. Registrar Estudiantes ");
        System.out.println("2. Mostrar estudiantes registrados ");
        System.out.println("0. Salir ");
        System.out.println(); 
    }
}