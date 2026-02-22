public class Variables {

    // primitive variable = storing the actual value
    // reference variable = storing an address of the heap to the value

    static void main() {

        // int = whole number

        int age; // declaration
        age = 21; // assignment

        int year = 2026; // both at the same time
        int quantity = 1;

        // double = decimal numbers

        double price = 4.99;
        double temperature = 25.5;

        // char = one letter

        char grade = 'A';
        char currency = '$';

        // boolean = true or false

        boolean isStudent = true;

        // (reference variable)
        // string = text
        String name = "Daniel";

        // printing the variables
        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);

        System.out.println("The year is " + year + ".");
        System.out.println("The price is " + price + ".");
        System.out.println("Your grade is " + grade + "!");
        System.out.println("You are a student: " + isStudent + ".");

        // if-statement
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }

        System.out.println("Hello, " + name + "!");
    }
}
