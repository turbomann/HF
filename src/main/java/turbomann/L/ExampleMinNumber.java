package turbomann.L;

import static turbomann.L.ExampleMinNumber.funcMin;

public class ExampleMinNumber {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = funcMin(a, b);
        System.out.println("Min value: " + c);
    }

    public static int funcMin(int n1, int n2) {
        int min;
        if (n1 > n2){
            min = n2;}
        else {
            min = n1;}
        return min;
    }
}
