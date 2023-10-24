package VIII_MultiThreading;

class VIPDownload extends Thread {
    private String content;
    public int status = 0;

    public VIPDownload(String content) {
        this.content = content;
    }

    //run() method achieves the multithreading
    @Override
    public void run() {
        //Causes current thread to pause for 0.8 milliseconds
        try {
            Thread.sleep((long) 0.8);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Starting VIP");

        while (status <= 100) {
            System.out.println("Downloading " + content + " : " + status + "%");
            status += 10;
        }
        status = 0;
    }
}

public class III_ThreadControlling {
    public static void main(String[] args) {
        DownloadContent thread1 = new DownloadContent("GAME 1");
        DownloadContent thread2 = new DownloadContent("GAME 2");
        VIPDownload thread3 = new VIPDownload("GAME 3");
        DownloadContent thread4 = new DownloadContent("GAME 4");
        DownloadContent thread5 = new DownloadContent("GAME 5");

        System.out.println("Statement 0.0");
        thread1.start();
        System.out.println("Statement 0.1");
        thread5.start();
        System.out.println("Statement 0.2");
        thread2.start();
        System.out.println("Statement 0.3");
        thread3.start();

        //join() method waits until the thread on which it is called terminates (note all above thread will run until thread5 is not terminated, the nest thread are halted only)
        //You may observe thread1 is continuing and after that Statement 1 is appearing. However, for all cases Statement 1 will appear after thread5 is completed
        try {
            thread5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Statement 1");
        thread4.start();
        System.out.println("Statement 2");
    }
}
