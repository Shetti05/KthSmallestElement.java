import java.io.File;

public class FileSizeChecker {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println("Size: " + file.length() + " bytes");
    }
}