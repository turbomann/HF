package GShildt.Chapter_5;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is a secret test message";
        String encodemsg = "";
        String decodemsg="";
        int key = 88;

        System.out.println("Current message: " + msg);
        for (int i = 0; i < msg.length(); i++)
            encodemsg = encodemsg +(char) (msg.charAt(i) ^ key);

        System.out.println("Zashifrovannoe message = " + encodemsg);

        for (int i = 0; i < msg.length(); i++)
            decodemsg = decodemsg + (char) (encodemsg.charAt(i) ^ key);
        System.out.println("Message afted decoding:" + decodemsg);

    }
}
