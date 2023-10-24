package VIII_MultiThreading;

import java.util.concurrent.Semaphore;

class ConnectionPool {
    private final int maxConnections;
    private final Semaphore availableConnections;

    public ConnectionPool(int maxConnections) {
        this.maxConnections = maxConnections;
        this.availableConnections = new Semaphore(maxConnections);
    }

    public void getConnection() {
        try {
            availableConnections.acquire(); // Acquire a connection permit
            System.out.println(Thread.currentThread().getName() + ": Connection Acquired");
            Thread.sleep(5000); //Simulating buffer
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            availableConnections.release(); // Release the connection permit
            System.out.println(Thread.currentThread().getName() + ": Connection Released");
        }
    }
}

public class V_Semaphore {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool(3); // Maximum 3 connections

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> connectionPool.getConnection());
            thread.start();
        }
    }
}
