package GShildt;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
char choise;
        System.out.println("Spravka: ");
        System.out.println("1. If");
        System.out.println("2. Swith");
        System.out.println("Select number");

       choise = (char) System.in.read();

       switch (choise){
           case '1':
               System.out.println("Infa o IF");
            break;

           case '2':
               System.out.println("infa o switch");
        break;
        default:
            System.out.println("Enter 1 or 2");

       }

    }


}
