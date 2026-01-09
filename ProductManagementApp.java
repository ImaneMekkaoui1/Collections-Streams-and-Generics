import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagementApp {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        products.add(new Product(1, "Laptop", 8000));
        products.add(new Product(2, "Mouse", 150));
        products.add(new Product(3, "Keyboard", 300));


        products.remove(1);


        products.forEach(System.out::println);


        products.get(0).setPrice(7500);


        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }
}
