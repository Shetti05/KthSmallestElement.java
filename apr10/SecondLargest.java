public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,5,15};
        int first=0, second=0;
        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
            } else if(i>second && i!=first){
                second=i;
            }
        }
        System.out.println(second);
    }
}