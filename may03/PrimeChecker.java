public class PrimeChecker {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;

        for(int i=2;i<n;i++){
            if(n%i==0) isPrime=false;
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}