package GShildt.Chapter_11;

public class MyTheard implements Runnable {
    String thrdName;
    Double a = Double.NEGATIVE_INFINITY;

    MyTheard(String name) {
        thrdName = name;
    }
    public void run() {
        System.out.print(thrdName + " Launch");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.print("B" + thrdName + "count: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.print(thrdName + "Interrupted");
        }
        System.out.print(thrdName + " is finished");
    }
}
class UseThread {
    public static void main(String[] args) {
        System.out.println("launch main potok");

        MyTheard mt = new MyTheard("Child #1");
        Thread th = new Thread(mt);
        th.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);

            } catch (InterruptedException exc) {
                System.out.print("Interrupt of MAIN potok");
            }
            System.out.print("End of MAIN potok");
        }


    }
}
