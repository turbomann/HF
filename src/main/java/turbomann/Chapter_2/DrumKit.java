package turbomann.Chapter_2;

/**
 * Created by Roman on 08.12.2017.
 */
public class DrumKit {
    boolean topHeat = true;
    boolean snare = true;
    void playTopHat() {
        System.out.println("din din dilin-dilin");
        }
    void playSnare(){
        System.out.println("bax bax bax");
    }

    }
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        d.playTopHat();

        if (d.snare == true){
            d.playSnare();
          }
    }


}
