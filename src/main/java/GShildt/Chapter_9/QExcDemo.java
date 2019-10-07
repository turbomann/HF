package src.main.java.GShildt.Chapter_9;

import src.main.java.GShildt.Chapter_8.qpack.ICharQ;

public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue f = new FixedQueue(10);
        char ch;
        int i;

        try {
            for (i = 0; i < 11; i++) {
                System.out.println("Try to save " + (char) ('A' + i));
                f.put((char) ('A' + i));
                System.out.println("- OK");
            }
            System.out.println();
        } catch (
                QueueFullException ef) {
            System.out.println(ef);
        }
        System.out.println();

        try {
            for (i = 0; i < 11; i++) {
                System.out.println("Get synbol from queue");
                ch = f.get();
                System.out.println(ch);

            }
        }
        catch(QueueIsEmpty ef){
            System.out.println(ef);
        }
    }

    static class QueueFullException extends Exception {
        int size;

        QueueFullException(int s) {
            size = s;
        }

        public String toString() {
            return "\nQueue is full, size is = " + size;
        }
    }


    static class QueueIsEmpty extends Exception {
        public String toString() {
            return "\n Queue is empty";
        }
    }

    static class FixedQueue implements IChar {

        private char q[];
        private int putlog, getlog;

        public FixedQueue(int size) {
            q = new char[size + 1];
            putlog = getlog = 0;
        }

        public void put(char ch)
                throws QueueFullException {
            if (putlog == q.length - 1)
                throw new QueueFullException(q.length - 1);
            putlog++;
            q[putlog] = ch;
        }

        public char get()
                throws QueueIsEmpty {
            if (getlog == putlog)
                throw new QueueIsEmpty();
            getlog++;
            return q[getlog];
        }
    }}


interface IChar{
    void put(char ch) throws QExcDemo.QueueFullException;
    char get() throws QExcDemo.QueueIsEmpty;
}

