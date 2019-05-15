package GShildt.Chapter_5;

class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;
        mask <<= numbits - 1;
        int spacer = 0;

        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1 ");
            else System.out.print("0 ");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }

        }
        System.out.println();
    }
}


class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits i = new ShowBits(8);
        ShowBits i1 = new ShowBits(32);
        ShowBits i2 = new ShowBits(64);

        System.out.print("123 в двоичном представлении = ");
        i.show(123);

        System.out.print("87987 в двоичном представлении = ");
        i1.show(87987);

        System.out.print("237658768 в двоичном представлении = ");
        i2.show(237658768);

        System.out.print("Младшие 8 бит= ");
        i.show(87987);

    }
}