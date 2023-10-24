package VIII_MultiThreading;

import java.util.concurrent.TimeUnit;

//NOTE: wait(), notify() and notifyAll() methods are defined in Object class not Thread class because they are related to lock and object has a lock.
class DownloadContent2 extends Thread {
    private String content;
    public int status = 0;
    private Object lock = new Object(); // Lock object

    public DownloadContent2(String content) {
        this.content = content;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (status <= 100) {
                System.out.println("Downloading " + content + " : " + status + "%");
                status += 10;
                if (status == 30) {
                    try {
                        System.out.println(content + " is pausing...");
                        lock.wait(); // Pause the thread
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void resumeDownload() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (lock) {
            System.out.println(content + " is resuming...");
            lock.notify(); // Notify one waiting thread
        }
    }

    public void resumeDownloadAll() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (lock) {
            System.out.println("All are resuming...");
            lock.notifyAll(); // Notify all waiting thread
        }
    }
}


public class IV_InterThreadCommunication {
    public static void main(String[] args) {
        DownloadContent2 thread1 = new DownloadContent2("GAME 1");
        DownloadContent2 thread2 = new DownloadContent2("GAME 2");
        DownloadContent2 thread3 = new DownloadContent2("GAME 3");
        DownloadContent2 thread4 = new DownloadContent2("GAME 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        //Observe a randomly chosen thread will be resumed
        //Also change the thread and observe the nature
        thread3.resumeDownload();

        //All threads will be resumed
        thread2.resumeDownloadAll();
    }
}