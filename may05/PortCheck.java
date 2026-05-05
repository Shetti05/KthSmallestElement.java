import java.net.Socket;

public class PortCheck {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("google.com", 80);
            System.out.println("Port Open");
            s.close();
        } catch (Exception e) {
            System.out.println("Port Closed");
        }
    }
}