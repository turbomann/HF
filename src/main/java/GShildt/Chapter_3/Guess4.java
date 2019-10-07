package GShildt.Chapter_3;

import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {

        char ch, ignore, answers = 'S';

        do {
            System.out.println("Letter between A-Z");
            System.out.println("Try to guess");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            }
            while (ignore != '\n');
            if (ch == answers)
                System.out.println("You win");
                    else{
                    System.out.println("Try one more time");
                    if (ch < answers) {
                        System.out.println("go to the end of Alphabet");
                    } else
                        System.out.println("go to top");

                    System.out.println();
                }
            } while (answers != ch) ;

        }
    }
