package GShildt.Chapter_5;

public class Phone {
    public static void main(String[] args) {
        String numbers [] [] = {
                {"Tom", "22-11-15"},
                {"Jessi","12-34-56"},
                {"Wlther","33-33-33"}

        };
        int i;
        if (args.length!=1) System.out.println("Using java phone <name>");

        for(i=0; i<numbers.length;i++)
        {
            if(numbers[i][0].equals(args[0]))
            {
                System.out.println(numbers[i][0]+ ": "+ numbers[i][1]);
                break;
            }
        }

        if(i==numbers.length)
            System.out.println("Name not found");
    }
}
