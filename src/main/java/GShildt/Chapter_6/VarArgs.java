package GShildt.Chapter_6;

public class VarArgs {


    static void varTest(int... v) {
        System.out.println("Amout of args" + v.length);
        System.out.print("Content: ");
        for (int i=0; i < v.length; i++)
                System.out.print("arg " + i + ": " + v[i]);
        System.out.println();

    }

    public static void main(String[] args) {
        varTest(10);
        varTest(1,2,3);
        varTest();
    }


}
