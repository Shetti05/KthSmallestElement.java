// File: MoveZeros.java
import java.util.*;

public class MoveZeros {
    public static void move(int[] arr) {
        int j = 0;
        for (int num : arr)
            if (num != 0)
                arr[j++] = num;

        while (j < arr.length)
            arr[j++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
}