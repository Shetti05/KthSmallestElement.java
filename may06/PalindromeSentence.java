import java.util.Scanner;

public class PalindromeSentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s", "").toLowerCase();

        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}