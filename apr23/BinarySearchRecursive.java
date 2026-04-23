public class BinarySearchRecursive {
    static int search(int[] arr, int l, int r, int x) {
        if(l<=r) {
            int mid=(l+r)/2;
            if(arr[mid]==x) return mid;
            if(arr[mid]>x) return search(arr,l,mid-1,x);
            return search(arr,mid+1,r,x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        System.out.println(search(arr,0,arr.length-1,5));
    }
}