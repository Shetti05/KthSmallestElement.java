import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
}