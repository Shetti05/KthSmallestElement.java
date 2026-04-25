import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num, original, remainder, result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();
        original = num;

        while (num != 0) {
            remainder = num % 10;
            result += Math.pow(remainder, 3);
            num /= 10;
        }

        if (original == result)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}