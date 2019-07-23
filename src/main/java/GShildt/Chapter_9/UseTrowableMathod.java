package src.main.java.GShildt.Chapter_9;

public class UseTrowableMathod {
    public static void main(String[] args) {
        try{
           ExcTest.genExceprion();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Just message");
            System.out.println(ex);
            System.out.println("Stack of vizovov");
ex.printStackTrace();
        }
    }
}
