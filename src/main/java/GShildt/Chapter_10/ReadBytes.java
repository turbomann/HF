package GShildt.Chapter_10;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
                byte [] data = new byte [10];
        System.out.println("enter symbols");
        System.in.read(data, 3,7);
        System.out.print(" You entered ");
        for(int i=0;i<data.length;i++){
            System.out.print((char)data[i]);
        }



    }
}
