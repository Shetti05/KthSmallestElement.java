import java.util.Scanner;

public class UserInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        if(sc.hasNextInt()) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}