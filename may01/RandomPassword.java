import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Random r = new Random();
        String pass = "";
        for(int i=0;i<8;i++) pass += chars.charAt(r.nextInt(chars.length()));
        System.out.println("Password: " + pass);
    }
}