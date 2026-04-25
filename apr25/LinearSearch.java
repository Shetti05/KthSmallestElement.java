public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 5};
        int key = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}