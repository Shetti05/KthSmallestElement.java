import java.io.*;

public class CSVReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}