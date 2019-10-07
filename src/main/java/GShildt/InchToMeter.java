package GShildt;
import LJV.*;

import static javafx.scene.input.KeyCode.L;

public class InchToMeter {
    public static void main(String[] args) {
        double metr;
        int counter;
        double inch = 39.37;

        for (inch=1; inch <= 144; inch++) {

            metr = inch/39.37;
            System.out.println(" In " + inch + " inch "+" Meter = " + metr + " inch ");
            metr++;

            if (inch % 12 == 0) {
                System.out.println();
            }
        }


    }
}
