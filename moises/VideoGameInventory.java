package moises;
import java.util.ArrayList;
import java.util.Scanner;
public class VideoGameInventory {
    static ArrayList<String> objects = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inventory(sc);

        showInventory(sc);

        sc.close();
    }
    static void inventory(Scanner sc) {
        System.out.println("Inventario de jugador: ");
        System.out.println("----------------------");
        System.out.print("¿Cuantos objetos desea agregar al inventario? : ");
        int newObject = sc.nextInt();
        for(int i = 0; i < newObject; i++) {
            System.out.print("Objeto " + (i + 1) + ": ");
            objects.add(sc.next());
        }
        System.out.println("-----------------------------------");
        System.out.println("Objetos del inventario disponibles. ");
        System.out.println("-----------------------------------");
        for(String object : objects) {
            System.out.println(object);
        }
        System.out.println("-------------------------------------");
        System.out.println("    Eliminar objetos del inventario.");
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.print("Ingrese un objeto del inventario a eliminar: ");
        String deleteObject = sc.next();

        if (objects.contains(deleteObject)) {
            objects.remove(deleteObject);

            System.out.println(deleteObject + " eliminado correctamente. ");
        } else {
            System.out.println("El objeto ingresado no se encuentra en el inventario. ");
        }
        System.out.println("-----------------------------");
        System.out.println("Inventario actualizado....");
        System.out.println("-----------------------------");
        for(String object : objects) {
            System.out.println(object);
        }
        System.out.println("Quedan " + objects.size() + " objeto. ");
    }
    static void showInventory(Scanner sc) {
        System.out.println("----------------------------------");
        System.out.println("Buscar objetos en el inventario... ");
        System.out.println("----------------------------------");
        System.out.print("Objeto a buscar: ");
        String showObject = sc.next();
        if (objects.contains(showObject)) {
            System.out.println(showObject + " Encontrado! ");
        } else {
            System.out.println(showObject + " No encontrado...");
        }
    }
}