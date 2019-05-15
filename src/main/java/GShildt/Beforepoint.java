package GShildt;

import java.io.IOException;

public class Beforepoint {
    public static void main(String[] args) throws IOException {
        int countspace = 0;
        char ch, answer = '.', ignore;


        do {
            System.out.println("Enter symbol from keyboard");
            ch = (char) System.in.read();
            if (ch == ' ') countspace++;
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        }

        while (ch != answer);
        {
            System.out.println("Try one more times");

        }
        System.out.println("Spaces was entered " + countspace);
    }

}

