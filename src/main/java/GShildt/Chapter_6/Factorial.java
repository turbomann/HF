package GShildt.Chapter_6;

public class Factorial {
    int facT(int n){

        int result;
        if(n==1) return 1;
        result = facT(n-1)*n;
        return  result;
    }
}

class TestFact{
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.facT(3));

    }
}