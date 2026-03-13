package moises;
import java.util.ArrayList;
import java.util.Scanner;
public class GradeCalculator {
    static ArrayList<Double> grades = new ArrayList<>();
    static double sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            grades.add(sc.nextDouble());
        }

        for(double grade : grades) {
            sum += grade;
        }

        double averagaNote = calculateAveraga();

        System.out.printf("Promedio: %.2f%n", averagaNote);

        sc.close();
    }    
    public static Double calculateAveraga() {

        for(double grade : grades) {
            System.out.println(grade);
        }

        System.out.println();

        double average = (double) sum / grades.size();

        return average;
    }
}