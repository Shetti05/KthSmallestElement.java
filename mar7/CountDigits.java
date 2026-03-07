public class CountDigits {
    public static int count(int num) {
        int digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(count(123456));
    }
}