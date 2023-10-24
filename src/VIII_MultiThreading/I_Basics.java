package VIII_MultiThreading;

class DownloadContent extends Thread {
    private String content;
    public int status = 0;

    public DownloadContent(String content) {
        this.content = content;
    }

    //run() method achieves the multithreading
    @Override
    public void run() {
        while (status <= 100) {
            System.out.println("Downloading " + content + " : " + status + "%");
            status += 10;
        }
        status = 0;
    }
}

public class I_Basics {
    public static void main(String[] args) {
        DownloadContent thread1 = new DownloadContent("GAME 1");
        DownloadContent thread2 = new DownloadContent("GAME 2");
        DownloadContent thread3 = new DownloadContent("GAME 3");

        //start() runs the run() method of the object
        //Note where the print statements are printed
        System.out.println("Print statement 0");
        thread1.start();
        System.out.println("Print statement 1");
        thread2.start();
        System.out.println("Print statement 2");
        thread3.start();
        System.out.println("Print statement 3");
    }
}
