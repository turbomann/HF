package GShildt.Chapter_10;

import java.io.*;
public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        if (args.length != 2) {
            System.out.println("Use java CompFiles File1 File2");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileInputStream fin2 = new FileInputStream(args[1])) {
            do {
                i = fin.read();
                j = fin2.read();

                if (fin != fin2) break;
            }
            while (i != -1 && j != -1);
            if (i != j){
                System.out.println("File" + fin + " and " + fin2 + "Doesnt match");
            }else {
                System.out.println("Files are equals");
            }

        } catch (IOException exc) {
            System.out.println("Error I / O" + exc);
        }

    }
}



