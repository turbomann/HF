package GShildt.Chapter_6;

public class Stack {

    private char q[];
    private int putloc, getloc;

    Stack(int size) {
        q = new char[size + 1];
        getloc=size;
        putloc=0;

    }


    void push(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("Queue is FULL ");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }


    char pop() {
        {getloc--;
           return q[getloc];
        }
    }





}

class TestStack {
    public static void main(String[] args) {

        int archivesize = 10;
        Stack bigQ = new Stack(archivesize);
        char ch;
        int i;

        System.out.println("Using Big Queue for saving Alphabet");
        for (i = 0; i < archivesize; i++)
            bigQ.push((char) ('A' + i));


        System.out.println("Dislplay bigQ");
        for (i = 0; i < archivesize; i++) {
            ch = bigQ.pop();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
//
//        System.out.println("Using small Queue for generating error");
//        for (i = 0; i < 5; i++) {
//            System.out.println("Try to save " + (char) ('Z' - i));
//            smallQ.push((char) ('Z' - i));
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("Display smallQ");
//        for (i = 0; i < 5; i++) {
//            ch = smallQ.pop();
//            if (ch != (char) 0) System.out.print(ch);
//        }
//    }
    }
}


