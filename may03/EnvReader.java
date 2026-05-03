public class EnvReader {
    public static void main(String[] args) {
        String value = System.getenv("JAVA_HOME");
        System.out.println("JAVA_HOME: " + value);
    }
}