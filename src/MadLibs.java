import java.util.Scanner;

public class MadLibs {
    // practice for variables an user input

    static void main() {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter another adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter another adjective (description): ");
        adjective3 = scanner.nextLine();
        System.out.print("Enter a noun (creature/thing): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter verb (action): ");
        verb1 = scanner.nextLine();

        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit i saw a(n) " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }
}
