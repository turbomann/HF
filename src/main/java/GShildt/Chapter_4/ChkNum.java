package GShildt.Chapter_4;

public class ChkNum {
    boolean isEven(int x) {
        if (x % 2 == 0) return true;
        else return false;
    }
}
class ParamDemo{
    public static void main(String[] args) {


    ChkNum chk = new ChkNum();
    if(chk.isEven(10)) System.out.println("This is EVEN number");
    if(chk.isEven(9)) System.out.println("This is EVEN number");
    if(chk.isEven(8)) System.out.println("This is EVEN number");
}}
