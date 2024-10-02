package task1.Structural.Adapter;

// Main.java
public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song1.mp3");
        audioPlayer.play("mp4", "video1.mp4");
        audioPlayer.play("vlc", "movie1.vlc");
        audioPlayer.play("avi", "video2.avi");
    }
}

