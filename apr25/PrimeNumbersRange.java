public class PrimeNumbersRange {
    public static void main(String[] args) {
        int start = 1, end = 50;

        for (int i = start; i <= end; i++) {
            int count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0 && i > 1)
                System.out.print(i + " ");
        }
    }
}