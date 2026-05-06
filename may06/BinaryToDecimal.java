import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal = " + decimal);
    }
}