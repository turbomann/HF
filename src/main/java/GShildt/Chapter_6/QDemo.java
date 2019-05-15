package GShildt.Chapter_6;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using Big Queue for saving Alphabet");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));


        System.out.println("Dislplay bigQ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using small Queue for generating error");
        for (i = 0; i < 5; i++) {
            System.out.println("Try to save " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        System.out.println("Display smallQ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }


}

class Queue {
    private char q[];
    private int putloc, getloc;

    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;

    }

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("Queue is FULL ");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("Queue is EMPTY");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}



