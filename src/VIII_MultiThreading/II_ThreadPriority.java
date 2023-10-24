package VIII_MultiThreading;

//Priority influence CPU to address the given thread as per its priority number

public class II_ThreadPriority {
    public static void main(String[] args) {
        DownloadContent thread1 = new DownloadContent("GAME 1");
        DownloadContent thread2 = new DownloadContent("GAME 2");
        DownloadContent thread3 = new DownloadContent("GAME 3");

        //Setting priority
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        System.out.println(thread1.getId() + ", " + thread1.getName() + ", " + thread1.getPriority());
        System.out.println(thread2.getId() + ", " + thread2.getName() + ", " + thread2.getPriority());
        System.out.println(thread3.getId() + ", " + thread3.getName() + ", " + thread3.getPriority());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
