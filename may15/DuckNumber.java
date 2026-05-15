import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        if (num.startsWith("0")) {
            System.out.println("Not Duck Number");
        } else if (num.contains("0")) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not Duck Number");
        }
    }
}