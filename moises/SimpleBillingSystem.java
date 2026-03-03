package moises;
import java.util.Scanner;
public class SimpleBillingSystem {
   static double calculateTax(double tax) {
    return tax * 0.07;
   }
   static double calculateTotal(double tax, double total) {
    return tax + total;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String product = sc.next();

        System.out.print("Ingrese la cantidad del dicho producto: ");
        int amount = sc.nextInt();

        System.out.print("Ingrese el precio del dicho producto: ");
        double price = sc.nextDouble();

        double subtotal = amount * price;

        double tax = calculateTax(subtotal);
        double total = calculateTotal(tax, subtotal);

        System.out.println("---FACTURA---");
        System.out.println("Producto: "+product);
        System.out.println("Cantidad: "+amount);
        System.out.println("Precio: "+price);
        System.out.println("subtotal: "+subtotal);
        System.out.println("Impuesto: "+tax);
        System.out.println("Total: "+total);

        sc.close();
    }
 }