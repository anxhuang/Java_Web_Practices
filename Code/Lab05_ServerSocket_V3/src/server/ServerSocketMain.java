package server;

public class ServerSocketMain {

    public static void main(String[] args) {
        final int PORT = 10000;
        Runnable r = new ServerRunnable(PORT);
        Thread t = new Thread(r);
        t.start();
        System.out.println("Server開工...");
    }
}
