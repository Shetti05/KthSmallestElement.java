import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sqrt = (int)Math.sqrt(n);

        if (sqrt * sqrt == n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}