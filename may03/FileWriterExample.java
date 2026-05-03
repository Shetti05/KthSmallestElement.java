import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("Hello Java");
        fw.close();
    }
}