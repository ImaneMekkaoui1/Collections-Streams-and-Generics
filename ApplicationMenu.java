import java.util.Scanner;

public class ApplicationMenu {

    public static void main(String[] args) {

        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1. Display products");
            System.out.println("2. Search product by ID");
            System.out.println("3. Add new product");
            System.out.println("4. Delete product by ID");
            System.out.println("5. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> metier.getAll().forEach(System.out::println);

                case 2 -> {
                    System.out.print("Enter ID: ");
                    long id = sc.nextLong();
                    System.out.println(metier.findById(id));
                }

                case 3 -> {
                    ProductGeneric p = new ProductGeneric(
                            1,
                            "Phone",
                            "Samsung",
                            3000,
                            "Smartphone",
                            10
                    );
                    metier.add(p);
                }

                case 4 -> {
                    System.out.print("Enter ID: ");
                    metier.delete(sc.nextLong());
                }
            }

        } while (choice != 5);
    }
}
