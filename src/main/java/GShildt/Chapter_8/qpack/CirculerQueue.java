package src.main.java.GShildt.Chapter_8.qpack;

public class CirculerQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;


    public CirculerQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }


    public void put(char ch) {
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println("The queue is full");
            return;
        }
        putloc++;
        if (putloc==q.length) putloc=0;
        q[putloc]=ch;
    }


    public char get() {
        if(putloc==getloc){
            System.out.println("The Queue is empty");
            return (char) 0;
        }
        getloc++;
        if(getloc==q.length) getloc=0;
    return q[getloc];
    }
}
