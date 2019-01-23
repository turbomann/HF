package turbomann.JFF;

public class Box {
    int widht;
    int height;
    int depth;

    Box(){
        widht = 10;
        height = 10;
        depth = 10;
    }

    int getVolume(){

        return widht*height*depth;
    }

    }
