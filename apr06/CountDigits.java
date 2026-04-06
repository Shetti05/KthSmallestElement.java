import java.util.*;

public class CountDigits {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345));
    }
}