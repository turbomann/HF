package Shildt.Chapter_3;


import java.io.IOException;

public class Break2 {
    public static void main(String[] args) throws IOException {
        char ch;

        for( ; ;){
            ch = (char) System.in.read();
            if (ch =='s')break;
        }
        System.out.println("you enter  s"  );
    }
}
