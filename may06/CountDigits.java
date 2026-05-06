import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, count = 0;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        while(n != 0) {
            n /= 10;
            count++;
        }

        System.out.println("Digits = " + count);
    }
}