public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int n : arr){
            if(n > first){
                second = first;
                first = n;
            } else if(n > second && n != first){
                second = n;
            }
        }
        System.out.println(second);
    }
}