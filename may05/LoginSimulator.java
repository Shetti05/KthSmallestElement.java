import java.util.Scanner;

public class LoginSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.nextLine();
        String pass = sc.nextLine();

        if(user.equals("admin") && pass.equals("1234")){
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }
    }
}