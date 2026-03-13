package moises;
import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {
    static ArrayList<Double> prices = new ArrayList<>();
    static double sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Carrito de compras..");
        System.out.println("----------------------");

        for(int i = 0; i < 5; i++) {
            System.out.print("Precio " + (i + 1) + ": ");
            prices.add(sc.nextDouble());
        }

        double sumPrices = calculateTotal();

        System.out.println("--------------------------");
        System.out.println("Precio total: " + sumPrices);
        System.out.println("--------------------------");

        sc.close();
    }
    static double calculateTotal() {
        for(double price : prices) {
            sum += price;
        }
        return sum;
    }
}