package turbomann.Chapter_2;

/**
 * Created by Roman on 07.12.2017.
 */
public class Player {
    int number = 0;
            public void guess(){
        number = (int)(Math.random()*10);
                System.out.println("I guess it is number .." + number);
            }
}
