import java.util.Scanner;
// import the scanner to accept user input

public class UserInput {
    static void main() {

        Scanner scanner = new Scanner(System.in); // creating an instance of the Scanner class

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // taking input from the next line

        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your full name: ");
        String fullName = scanner.next(); // taking input until the next space
        scanner.nextLine();

        System.out.println("Hello, " + fullName + "!");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // input of type int
        System.out.println("You are " + age + " years old.");

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble(); // input of type double
        System.out.println("Your gpa is " + gpa + " .");

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // input of type boolean
        if (isStudent) {
            System.out.println("You are enrolled!");
        } else {
            System.out.println("You are not enrolled!");
        }

        // COMMON ISSUE
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // without this the new line messes up the assignment

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color + ".");

        scanner.close(); // end the scanner, so it doesn't lead to unexpected behavior
    }
}
