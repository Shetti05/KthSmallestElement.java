import java.io.File;

public class DirectoryCreator {
    public static void main(String[] args) {
        File dir = new File("myFolder");
        if (dir.mkdir()) {
            System.out.println("Directory created");
        }
    }
}