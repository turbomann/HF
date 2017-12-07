package turbomann.Chapter_2;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Roman on 07.12.2017.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void StartGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int player1guess = 0;
        int player2guess = 0;
        int player3guess = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println("Number 0....9");

        while (true){
            System.out.println("Number for guessing  " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            player1guess = p1.number;
            System.out.println("first player guess" + player1guess);

            player2guess = p2.number;
            System.out.println("second player guess" + player2guess);

            player3guess = p3.number;
            System.out.println("third player guess" + player3guess);


            if (player1guess == targetNumber){
                p1IsRight= true;
            }

            if (player2guess == targetNumber){
                p2IsRight= true;
            }

            if (player3guess == targetNumber){
                p3IsRight= true;
            }


            if (p1IsRight || p2IsRight || p3IsRight){
                System.out.println("WINNER");
                System.out.println("First pyauer right?" + p1IsRight);
                System.out.println("Second pyauer right?" + p2IsRight);
                System.out.println("Third pyauer right?" + p3IsRight);
                System.out.println("End of game!");
                break;

            }
            else {
                System.out.println("GO AGAIN");
            }
        }

    }

}
