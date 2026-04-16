import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4};
        Set<Integer> set = new HashSet<>();
        for(int n: arr){
            if(!set.add(n)){
                System.out.println("Duplicate: " + n);
            }
        }
    }
}