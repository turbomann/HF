package GShildt.Chapter_7;

class A {
    int i, j;

    A(int x, int y) {
        i = x;
        j = y;

    }

    void show() {
        System.out.println(" i :" + i + " j: " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;


    }
void show(){
        super.show();
    System.out.println(" k :" + k);
}
}

class Overrider{
    public static void main(String[] args) {
        B sub = new B(1,2,3);
        sub.show();
    }
}