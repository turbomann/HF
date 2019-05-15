package GShildt.Chapter_6;

public class FailSofrArray {
    private int a[];
    private int errval;

    public int lenght;

    public FailSofrArray(int size, int errvl) {
        a = new int[size];
        errval = errvl;
        lenght = size;
    }

    public int get(int index) {
        if (indexOk(index)) return a[index];
        return errval;
    }

    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOk(int index) {
        if (index >= 0 & index < lenght) return true;
        return false;
    }

}


class FSDemo {
    public static void main(String[] args) {
        FailSofrArray fs = new FailSofrArray(5, -1);
        int x;
        System.out.println("Processing of errors");

        for (int i = 0; i < (fs.lenght * 2); i++)
            fs.put(i, i * 10);

        for (int i = 0; i < (fs.lenght); i++) {
            x = fs.get(i);

            if (x != -1) System.out.println("x = " + x + " ");
        }
        System.out.println("");
        System.out.println("\n Processing of Error + display log");

        for (int i = 0; i < (fs.lenght * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("index " + i + " Vne range");

        for (int i = 0; i < (fs.lenght * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
            else System.out.println("Index " + i + "Vne range");
        }


    }
}