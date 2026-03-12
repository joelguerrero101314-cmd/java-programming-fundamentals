package moises;
import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();

        products.add("Jabon");
        products.add("Leche");
        products.add("Chocolate");
        products.add("Cereal");
        products.add("Azucar");

        System.out.println("Productos en el almacen. ");
        System.out.println();
        for(String product : products) {
            System.out.println(product);
        }

        System.out.println();

        System.out.print("Agrega un nuevo producto: ");
        String addProduct = sc.next();

       products.add(addProduct);

       System.out.println();

       System.out.println("Lista con el nuevo producto " + addProduct + " agg> ");
       System.out.println();

       for(String product : products) {
        System.out.println(product);
       }

       System.out.println();

       System.out.print("¿Que producto desea eliminar? : ");
       String deleteProduct = sc.next();

       products.remove(deleteProduct);

       System.out.println("");

       System.out.println("Nueva lista con el producto " + deleteProduct + " eliminado. ");

       System.out.println();

       for(String product : products) {
        System.out.println(product);
       }

       System.out.println();

       System.out.print("¿Que producto desea buscar? : ");
       String searchProduct = sc.next();

       System.out.println();

       if (products.contains(searchProduct)) {
        System.out.println(searchProduct + " Si existe en posicion: " + searchProduct.indexOf(searchProduct));
       } else {
        System.out.println(searchProduct + " No encontrado en la lista. ");
       }
        sc.close();
    }   
}