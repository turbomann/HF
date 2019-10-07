package GShildt.Chapter_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin=null;
        FileOutputStream fout=null;

        if (args.length != 2) {
            System.out.println("Use syntax Copy FROM TO");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != 1) fout.write(i);
            } while ((i != -1));
        } catch (IOException exc) {
            System.out.println("Error I/O" + exc);
        } finally {
            try {
                if (fin != null) ;
                fin.close();
            } catch (IOException exc) {
                System.out.println("Error during of close in file");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Error during of close OUT file" + exc);
            }

        }
    }

}
