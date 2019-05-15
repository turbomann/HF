package GShildt.Chapter_6;

public class MyClass {
    private int alpha;
    public int beta;
    int gamma;


     void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    int getAlpha() {
        return alpha;
    }
}
class AccessDemo
{
    public static void main(String[] args) {


        MyClass ob = new MyClass();
        ob.setAlpha(-99);
        System.out.println("ob.alpha = "+ob.getAlpha());

ob.beta = 98;
ob.gamma=97;

        System.out.println(ob.beta +" "+ ob.gamma +" "+ ob.getAlpha());

    }
}