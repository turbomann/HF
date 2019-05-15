package GShildt.Chapter_5;

public class Encode_test {
    public static void main(String[] args) {
        String msg = "This is a secret test message";
        String encodemsg = "";
        String decodemsg = "";
        String key = "12345678";
        int j;
        System.out.println("Current message: " + msg);
        j=0;
        for (int i = 0; i < msg.length(); i++) {
            encodemsg = encodemsg + (char) (msg.charAt(i) ^ key.charAt(j));
           j++;
            if(j==8) j=0;
        }
        System.out.println("Zashifrovannoe message: " + encodemsg);

        j=0;
        for (int i = 0; i < msg.length(); i++) {
            decodemsg = decodemsg + (char) (encodemsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j==8) j=0;
        }

        System.out.println(" " + decodemsg);

    }
}
