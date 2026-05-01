public class ShutdownHookDemo {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("App closing...");
        }));
        System.out.println("Press Ctrl+C to exit");
    }
}