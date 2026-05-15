import java.util.Scanner;

public class CircularPrime {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = String.valueOf(n);

        boolean circular = true;

        for (int i = 0; i < str.length(); i++) {
            str = str.substring(1) + str.charAt(0);

            int num = Integer.parseInt(str);

            if (!isPrime(num)) {
                circular = false;
                break;
            }
        }

        if (circular)
            System.out.println("Circular Prime");
        else
            System.out.println("Not Circular Prime");
    }
}