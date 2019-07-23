package src.main.java.GShildt.Chapter_9;

public class ExcTest {
    static void genExceprion()
    {
int nums[] = new int[4];
        System.out.println("Line before exception");
        nums [5]=10;
        System.out.println("Line won't be displayed");
    }
}


class ExDemo2{
    public static void main(String[] args) {
        try
        {
            ExcTest.genExceprion();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Vixod za granizy massiva");
        }
        System.out.println("Line after catch");
    }
}
