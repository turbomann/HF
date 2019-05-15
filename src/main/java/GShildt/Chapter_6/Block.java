package GShildt.Chapter_6;

import java.sql.SQLOutput;

public class Block {
    int a,b,c, volume;

    Block (int i, int y, int h){
        a=i;
        b=y;
        c=h;

        volume= a*b*c;
    }

    boolean sameBlock( Block ob){
        if ((ob.a ==a)&(ob.b ==b)&(ob.c==c)) return true;
        return false;

    }
    boolean sameVolume(Block ob){
        if(ob.volume == volume) return true;
        return false;
    }


}

class PassOb{
    public static void main(String[] args) {


    Block ob1=new Block(10,2,5);
    Block ob2=new Block(10,2,5);
    Block ob3=new Block(4,5,5);

        System.out.println("ob1 the same size as ob2 :" + ob1.sameBlock(ob2));
        System.out.println("ob1 the same size as ob3 :" + ob1.sameBlock(ob3));
        System.out.println("ob1 the same volume as ob3 :" + ob1.sameVolume(ob3));
}}