package Shildt.Chapter_3;

import java.io.IOException;

public class DWDemo {
    public static void main(String[] args) throws IOException {
        char ch;
        do {
            System.out.println("Print eny key");
            ch = (char) System.in.read();
        }
        while (ch != 'q');

    }

}

