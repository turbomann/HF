package src.main.java.GShildt.Chapter_9;

public class TrowDemo {
    public static void main(String[] args) {
        try{
            System.out.println("before catch operator");
            throw new ArithmeticException();
        } catch (ArithmeticException ex){
            System.out.println("Exceprion catched");
        }
        System.out.println("After catch blog");
    }
}
