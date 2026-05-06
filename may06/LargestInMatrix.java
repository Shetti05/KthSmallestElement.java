import java.util.Scanner;

public class LargestInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];

        int max = Integer.MIN_VALUE;

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                arr[i][j] = sc.nextInt();

                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }

        System.out.println("Largest = " + max);
    }
}