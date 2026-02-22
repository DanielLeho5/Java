import java.sql.SQLOutput;
import java.util.Scanner;

public class ShoppingCart {
    // practice for user input variables and arithmetic

    static void main() {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.println("How much does the item cost?: ");
        price = scanner.nextDouble();
        System.out.println("How many would you like to buy?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println(quantity + " " + item + "(s) will cost: " + currency + total + "!");

        scanner.close();
    }
}
