import java.util.Scanner;

public class IfStatements {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // if-elseif-else: executes body if condition is true, otherwise goes to the else block

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        if (age >= 100) {
            System.out.println("You are very old!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
                System.out.println("You are a baby!");
        } else {
            System.out.println("You are a child!");
        }

        if (isStudent) {
            System.out.println("You are enrolled!");
        } else {
            System.out.println("You are not enrolled!");
        }

        scanner.close();
    }
}
