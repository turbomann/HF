package turbomann.Chapter_4;

public class Xcopy {
    public static void main(String[] args) {
        int orig = 42;
        Xcopy x = new Xcopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    public int go(int arg){
        arg = arg * 2;
        return arg;
    }
}

