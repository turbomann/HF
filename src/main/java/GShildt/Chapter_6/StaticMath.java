package GShildt.Chapter_6;

public class StaticMath {
    static int val = 1024;

    static int valDiv2(){
        return val/2;
    }
}

class DemoStatic2{
    public static void main(String[] args) {

        System.out.println("Value of variable val = " + StaticMath.val);
        System.out.println("Value of variable val = " + StaticMath.valDiv2());

        System.out.println();
        StaticMath.val =4;

        System.out.println("Value of variable val = " + StaticMath.val);
        System.out.println("Value of variable val = " + StaticMath.valDiv2());


    }
}