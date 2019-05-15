package GShildt.Chapter_4;

public class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo o = new FDemo(0);
        for(count =1; count<10000;count++){
            o.generator(count);
        }
    }
}
class FDemo{
    int x;
    FDemo(int i){
        x=i;
    }

    protected void finzlize (){
        System.out.println("Финализация " + x);
    }

    void generator (int i){
        FDemo o =new FDemo(i);
    }
}
