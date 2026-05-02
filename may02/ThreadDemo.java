class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new MyThread().start();
    }
}