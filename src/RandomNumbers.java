import java.util.Random;

public class RandomNumbers {
    static void main() {
        Random random = new Random(); // creating an instance of the random class to use latet

        int number = random.nextInt(1,7);
        // origin: inclusive, bound: exclusive => generate a number between 1 and 6

        double decimalNumber = random.nextDouble(); // generate a random doubel 0-.9999...

        boolean isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(decimalNumber);

        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
