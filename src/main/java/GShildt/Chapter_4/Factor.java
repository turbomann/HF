package GShildt.Chapter_4;

public class Factor {

    boolean isFactor(int a, int b){
        if((b%a)==0) return  true;
        else return false;
    }

}

class TestFactor {
    public static void main(String[] args) {

        Factor f= new Factor();
        if(f.isFactor(2,20)) System.out.println("delitel 2");
        if(f.isFactor(3,20)) System.out.println("the string shouldn't displayed");

    }
        }
