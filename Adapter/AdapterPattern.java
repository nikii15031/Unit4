package adapter;

public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        
        audioPlayer.play("mp3","Badshah.mp3");
        audioPlayer.play("mp4","honey.mp4");
        audioPlayer.play("vlc","vlc.com");
        audioPlayer.play("avi","avi.com");
    }
    
}