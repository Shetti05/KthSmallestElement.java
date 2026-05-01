public class EnvReader {
    public static void main(String[] args) {
        String path = System.getenv("PATH");
        System.out.println("System PATH: " + path);
    }
}