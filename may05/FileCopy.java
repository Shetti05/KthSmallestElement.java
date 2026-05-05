import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("dest.txt");

        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }

        fis.close();
        fos.close();
        System.out.println("Copied");
    }
}