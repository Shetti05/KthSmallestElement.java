import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for(int i=start;i<=end;i++) {
            int count = 0;

            for(int j=1;j<=i;j++) {
                if(i % j == 0)
                    count++;
            }

            if(count == 2)
                System.out.print(i + " ");
        }
    }
}