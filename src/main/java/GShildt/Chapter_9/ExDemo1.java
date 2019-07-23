package src.main.java.GShildt.Chapter_9;

public class ExDemo1 {
    public static void main(String[] args) {
        int num [] = new int [4];

        try {
            System.out.println("Before generation of Exception");
            num[10]=9;
            System.out.println("The line won't showing");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Vixod ze granizzy massiva");

        }
        System.out.println("Line will be displayed");

    }
}
