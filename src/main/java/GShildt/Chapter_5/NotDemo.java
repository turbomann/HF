package GShildt.Chapter_5;

public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;
        System.out.println();
        for (int i = 128; i > 0; i = i / 2) {
            if ((i & b) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }

        System.out.println();
        b = (byte) ~b;
        for (int i = 128; i > 0; i = i / 2) {
            if ((i & b) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }

    }
}
