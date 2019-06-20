package GShildt.Chapter_6;

public class VarArgs2 {
    static void varTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.print("Content: ");
        for (int i=0; i < v.length; i++)
            System.out.print("arg " + i + ": " + v[i]);
        System.out.println();

    }
    public static void main(String[] args) {
        varTest("One value in array",10);
        varTest("Tree values in array",1,2,3);
        varTest("ZERO values in array");
    }
}
