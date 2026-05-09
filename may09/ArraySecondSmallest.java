import java.util.Scanner;

public class ArraySecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                second = smallest;
                smallest = num;
            } else if (num < second && num != smallest) {
                second = num;
            }
        }

        System.out.println("Second Smallest: " + second);
    }
}