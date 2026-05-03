public class EmailValidator {
    public static void main(String[] args) {
        String email = "test@mail.com";
        System.out.println(email.contains("@") ? "Valid" : "Invalid");
    }
}