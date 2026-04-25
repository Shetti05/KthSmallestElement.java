import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int count = 0;

        System.out.print("Enter string: ");
        str = sc.nextLine().toLowerCase();

        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1)
                count++;
        }

        System.out.println("Vowels: " + count);
    }
}