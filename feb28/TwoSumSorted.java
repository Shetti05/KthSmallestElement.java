public class TwoSumSorted {

    public static int[] twoSum(int[] arr, int target) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) return new int[]{l, r};
            if (sum < target) l++;
            else r--;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] res = twoSum(arr, 9);
        System.out.println(res[0] + " " + res[1]);
    }
}