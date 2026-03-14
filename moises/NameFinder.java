package moises;
import java.util.ArrayList;
import  java.util.Scanner;
public class NameFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        for(int i = 0; i < 6; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            students.add(sc.next());
        }

        System.out.println();

        System.out.println("Lista de estudiantes....");
        for(String student : students) {
            System.out.println(student);
        }

        System.out.println();

        System.out.print("Ingrese un estudiante a buscar: ");
        String showStudent = sc.next();

        if (students.contains(showStudent)) {
            System.out.println(showStudent + " Encontrado! ");
        } else {
            System.out.println(showStudent + " No encontrado...");
        }
        sc.close();
    }
}