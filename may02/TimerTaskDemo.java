import java.util.*;

public class TimerTaskDemo {
    public static void main(String[] args) {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            public void run() {
                System.out.println("Running task...");
            }
        }, 1000);
    }
}