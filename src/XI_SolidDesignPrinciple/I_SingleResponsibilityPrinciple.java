package XI_SolidDesignPrinciple;

//A class should only have one responsibility and only one reason for change. Or in other words, a class should serve only functionality

import java.awt.Desktop;
import java.net.URI;

//Notice I put revenue generator in different class this:
//1. Makes codebase easy to maintain
//2. Improves readability
//3. Makes video class more reusable
//4. Reduce bug risk

class Video {
    private String title;
    private String url;
    private boolean liked = false;
    private int views = 0;

    public Video(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public void liked() {
        liked = !liked;
    }

    public void watch() {
        try {
            URI uri = new URI(url);
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
                views++;
            } else {
                System.out.println("Desktop is not supported on this platform.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getViews() {
        return views;
    }

    public boolean isLiked() {
        return liked;
    }
}

class revenueGenerator {
    public static double totalRevenue(int views, boolean liked) {
        return views * (0.01 + (liked ? 0.02 : 0));
    }
}

public class I_SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Video video1 = new Video("Sample Video", "https://www.youtube.com/watch?v=dQw4w9WgXcQ");

        video1.watch();
        video1.liked();

        System.out.println("Revenue = $" + revenueGenerator.totalRevenue(video1.getViews(), video1.isLiked()));
    }
}
