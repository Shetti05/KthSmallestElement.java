public class CycleDetection {

    public static boolean hasCycle(int[] nums) {
        int slow = 0, fast = 0;

        while(fast < nums.length && nums[fast] < nums.length) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(hasCycle(arr));
    }
}