package turbomann.Chapter_9;

public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();


    }

    public static void doStuff(GC copyGC) {
        GC localGC;
    }
}


