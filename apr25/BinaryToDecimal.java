import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary, decimal = 0, base = 1;

        System.out.print("Enter binary: ");
        binary = sc.nextInt();

        while (binary > 0) {
            int last = binary % 10;
            decimal += last * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal: " + decimal);
    }
}