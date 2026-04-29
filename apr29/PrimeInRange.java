public class PrimeInRange {
    public static void main(String[] args) {
        int start = 10, end = 50;

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            if (i < 2) continue;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) System.out.print(i + " ");
        }
    }
}