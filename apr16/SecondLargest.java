import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,1,9,3,7};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}