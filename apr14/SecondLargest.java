public class SecondLargest {
    public static int find(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            } else if(num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,9,3};
        System.out.println(find(arr));
    }
}