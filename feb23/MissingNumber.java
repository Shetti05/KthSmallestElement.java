public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4};
        int n = 4;
        System.out.println("Missing Number: " + findMissing(arr, n));
    }
}