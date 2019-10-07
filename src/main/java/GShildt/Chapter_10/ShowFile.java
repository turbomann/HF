    package GShildt.Chapter_10;

    import java.io.*;

    public class ShowFile {
        public static void main(String[] args) {
            int i;
            FileInputStream fin = null;

            if (args.length != 1) {
                System.out.println("Use name of file");
                return;
            }

            try {
                fin = new FileInputStream(args[0]);
                do {
                    i = fin.read();
                    if (i != -1) System.out.println((char) i);
                } while (i != -1);
            } catch (FileNotFoundException exc) {
                System.out.println("File not fond");
            } catch (IOException exc) {
                System.out.println("Error I / O operation");
            } finally {
                try {
                    if (fin != null) fin.close();
                } catch (IOException exc) {
                    System.out.println("Error while file closing");
                }
            }
        }
    }
