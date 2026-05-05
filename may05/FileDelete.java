import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File f = new File("test.txt");
        if(f.delete()){
            System.out.println("Deleted");
        }
    }
}