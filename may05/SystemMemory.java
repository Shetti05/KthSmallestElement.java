public class SystemMemory {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Free Memory: " + r.freeMemory());
    }
}