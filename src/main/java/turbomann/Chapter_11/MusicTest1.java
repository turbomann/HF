package turbomann.Chapter_11;
import javax.sound.midi.*;
public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("WE GOT SINTeZATOR");
        } catch(MidiUnavailableException ex){
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
    }

