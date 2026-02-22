public class ArithmeticOperators {

    static void main() {
        int x = 10;
        int y = 3;
        int z;

        z = x + y;
        System.out.println(z);
        z = x - y;
        System.out.println(z);
        z = x * y;
        System.out.println(z);
        z = x / y;
        System.out.println(z); // rounded down because of int
        z = x % y;
        System.out.println(z);

        x += y;
        System.out.println(x);
        x -= y;
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        x %= y;
        System.out.println(x);

        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        // pemdas - order of operation
        // parenthesys exponents multiplication division addition subtraction
        System.out.println(3 + 4 * (7 -5) / 2.8);
    }
}
