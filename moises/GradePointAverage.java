package moises;
import java.util.Scanner;
public class GradePointAverage {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        double note;
        System.out.print("Ingrese la primera nota: ");
        note = sc.nextDouble();
        suma = suma + note;
        System.out.print("Ingrese la segunda nota: ");
        note = sc.nextDouble();
        suma = suma + note;
        System.out.print("Ingrese la tercera nota: ");
        note = sc.nextDouble();
        suma = suma + note;
        System.out.print("Ingrese la cuarta nota: ");
        note = sc.nextDouble();
        suma = suma + note;
        System.out.print("Ingrese la quinta nota: ");
        note = sc.nextDouble();
        suma = suma + note;

        double promedio = suma / 5.0;

        if (promedio > 70 ) {
            System.out.println("Aprobado ");
        }else{
            System.out.println("Reprobado ");
        }
        
        sc.close();
    }
}
