package turbomann.Chapter_3;

public class TestArray {
    public static void main(String[] args) {
        String [] islands = new String[4];
        int [] index = new int[4];
        int y = 0;
        islands[0] = "Bermuds";
        islands[1] = "Figy";
        islands[2] = "Azor islands";
        islands[3] = "Kosumel";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int ref;
        while (y < 4){
            ref = index[y];
            System.out.print("Islands = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
