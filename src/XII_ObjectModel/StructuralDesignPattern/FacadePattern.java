package XII_ObjectModel.StructuralDesignPattern;

//Facade literally means mask, notice that client code(main method) will think the multimedia facade is doing the job but actually its just calling the subsystems

// AudioPlayer - Subsystem Component
class AudioPlayer {
    public void play(String audioType, String fileName) {
        System.out.println("Playing " + audioType + " file: " + fileName);
    }
}

// VideoPlayer - Subsystem Component
class VideoPlayer {
    public void play(String videoType, String fileName) {
        System.out.println("Playing " + videoType + " file: " + fileName);
    }
}

// MultimediaFacade - Facade
class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;

    public MultimediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
    }

    public void playAudio(String fileName) {
        audioPlayer.play("Audio", fileName);
    }

    public void playVideo(String fileName) {
        videoPlayer.play("Video", fileName);
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        MultimediaFacade multimediaFacade = new MultimediaFacade();

        // Using the facade to play audio and video

        multimediaFacade.playVideo("movie.mp4");
    }
}
