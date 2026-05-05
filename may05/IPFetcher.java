import java.net.*;
import java.io.*;

public class IPFetcher {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api64.ipify.org");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        System.out.println("IP: " + br.readLine());
    }
}