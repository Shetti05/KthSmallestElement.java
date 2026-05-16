import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i=0;i<5;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<5;i++) {
            for(int j=0;j<4-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for(int num : arr)
            System.out.print(num + " ");
    }
}