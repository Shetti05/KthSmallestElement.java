import java.io.*;
import java.util.zip.*;

public class ZipExample {
    public static void main(String[] args) throws Exception {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("out.zip"));
        zos.putNextEntry(new ZipEntry("test.txt"));
        zos.write("Hello".getBytes());
        zos.close();
    }
}