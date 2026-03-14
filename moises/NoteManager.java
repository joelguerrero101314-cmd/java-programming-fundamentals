package moises;
import java.util.ArrayList;
import java.util.Scanner;
public class NoteManager {
    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Boolean> completedList = new ArrayList<>();
    static void menuTask() {
        System.out.println(" MENU");
        System.out.println(" 1. Agregar tareas ");
        System.out.println(" 2. Eliminar tareas ");
        System.out.println(" 3. Mostrar tareas ");
        System.out.println(" 4. Marcar tareas como completada ");
        System.out.println(" 0. Salir ");
        System.out.println();
    }
    static void addTask(Scanner sc) {
        System.out.println("Agregar tareas ");
        System.out.println();
        System.out.print("Ingrese el nombre de la tarea: ");
        tasks.add(sc.next());
        completedList.add(false);
        System.out.println("Tarea agregada correctamente...");
    }
    static void deleteTask(Scanner sc) {
        System.out.println("Eliminar tareas ");
        System.out.println();
        System.out.print("Ingrese el nombre de la tarea a eliminar: ");
        String deleteTask = sc.next();
        System.out.println();
        if (tasks.contains(deleteTask)) {
            int pos = tasks.indexOf(deleteTask);
            tasks.remove(pos);
            completedList.remove(pos);
            System.out.println("La tarea " + deleteTask + " eliminada correctamente.");
            System.out.println();
        } else {
            System.out.println("[ERROR]" + deleteTask + " no existe en el sistema...");
        }
    }
    static void showTask() {
        System.out.println("Mostrar tareas pendientes ");
        System.out.println();
        for(String task : tasks) {
            System.out.println(task);
        }
        System.out.println();
    }
    static void taskCompleted(Scanner sc) {
        System.out.println("Tarea completada ");
        System.out.println("Ingrese el nombre de la tarea que completo: ");
        String completedTask = sc.next();
        System.out.println();
        if (tasks.contains(completedTask)) {
            int pos = tasks.indexOf(completedTask);
            tasks.remove(completedTask);
            completedList.set(pos, true);
            System.out.print(completedTask + " marcada como completada. ");
        } else {
            System.out.println("Tarea no encontrada. ");
        }
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int option = 0;
    do {
        menuTask();
        System.out.print("Seleccione una opcion: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                addTask(sc); break;
            case 2: 
                deleteTask(sc); break;
            case 3:
                showTask(); break;
            case 4:
                taskCompleted(sc); break;
            case 0:
                System.out.println("Hasta pronto! "); break;
            default:
                System.out.println("[ERROR] Opcion invaida! "); break;
        }

    }while(option != 0);
        System.out.println("Saliendo del sistema...");
    sc.close();
  }
}