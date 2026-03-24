// File: MergeSortedArrays.java
import java.util.*;

public class MergeSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int i=0, j=0, k=0;
        int[] res = new int[a.length + b.length];

        while (i < a.length && j < b.length)
            res[k++] = (a[i] < b[j]) ? a[i++] : b[j++];

        while (i < a.length) res[k++] = a[i++];
        while (j < b.length) res[k++] = b[j++];

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        System.out.println(Arrays.toString(merge(a,b)));
    }
}