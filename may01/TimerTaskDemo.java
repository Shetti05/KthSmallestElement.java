import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo {
    public static void main(String[] args) {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            public void run() {
                System.out.println("Task executed");
            }
        }, 2000);
    }
}