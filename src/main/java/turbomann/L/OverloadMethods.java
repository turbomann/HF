package turbomann.L;

public class OverloadMethods {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        double c =11.1;
        double d = 12.2;
        int results1 = sums(a, b);
        double results2 = sums(c, d);

        System.out.println(results1);
        System.out.println(results2);

    }


    public static int sums (int a, int b){
        int c = a+b;
        return c;
    }

    public static double sums (double c,double d){
        double  r = c + d;
        return r;
    }

}
