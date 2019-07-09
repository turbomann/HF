package src.main.java.GShildt.Chapter_8.qpack;

public class DynQueue implements ICharQ {

    private char q[];
    private int putloc, getloc;


    public DynQueue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;

    }

    public void put(char ch) {
        if (putloc == q.length - 1) {
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
                q = t;
            }
            q[putloc++] = ch;
        }


    public char get() {
        if (getloc == putloc) {
            System.out.println("The queue is empty");
            return (char) 0;
        }

        return q[getloc++];
    }
}
