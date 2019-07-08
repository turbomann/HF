package src.main.java.GShildt.Chapter_8;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue fq = new FixedQueue(10);
        DynQueue dq = new DynQueue(5);
        CirculerQueue cq = new CirculerQueue(10);


        ICharQ iQ;
        char ch;
        int i;

        iQ = fq;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        System.out.println("display Fixed Queue");

        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println(" ");


        iQ = dq;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        System.out.println("Dynamic Queue");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("");


        iQ = cq;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));
        System.out.println("Circle Queue");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("");


        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\n" + "Save circle ");

        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}





