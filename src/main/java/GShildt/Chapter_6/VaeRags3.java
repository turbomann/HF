package GShildt.Chapter_6;

public class VaeRags3 {
    static void varTest(int... v) {
        System.out.println(" Amout of args " + v.length);
        System.out.print("Content: ");
        for (int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }
    static void varTest(boolean... v) {
        System.out.println(" Amout of args " + v.length);
        System.out.print("Content: ");
        for (int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();

    }
    static void varTest(String msg, int... v) {
        System.out.println(" Amout of args " + v.length + " ");
        System.out.print("Content: ");
        for (int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();

    }

    public static void main(String[] args) {
        varTest(1,2,3);
        varTest("Test",1,2);
        varTest(true,false,false);
    }
}
