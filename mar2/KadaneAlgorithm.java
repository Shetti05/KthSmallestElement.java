public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar = arr[0], current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maxSoFar = Math.max(maxSoFar, current);
        }

        System.out.println("Max Subarray Sum: " + maxSoFar);
    }
}