package GShildt.Chapter_5;

public class StringSwith {
    public static void main(String[] args) {
        String command = "cancel";

        switch (command) {

            case "connect":
                System.out.println("connect");
                break;
            case "cancel":
                System.out.println("cancel");
                break;
            case "disconnect":
                System.out.println("disconnect");
                break;
            default:
                System.out.println("default");
                break;


        }
    }
}
