import java.net.Socket;

public class PortScanner {
    public static void main(String[] args) {
        for(int port=20; port<30; port++) {
            try {
                Socket s = new Socket("localhost", port);
                System.out.println("Open: " + port);
                s.close();
            } catch(Exception e) {}
        }
    }
}