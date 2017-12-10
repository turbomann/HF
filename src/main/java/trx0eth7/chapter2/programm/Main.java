package trx0eth7.chapter2.programm;

import trx0eth7.chapter2.programm.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static trx0eth7.chapter2.programm.builder.BuilderShape.createShape;

/**
 * Sources:
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html">Scanner</a>
 * @see <a href="https://habrahabr.ru/post/260773/">Pattern, Matcher</a>
 */
public class Main {
    private List<Pattern> patterns = new ArrayList<>();

    public static void main(String... args) {
        Main main = new Main();
        main.init();
        IShape shape;

        //Program use console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Possible options:\nCircle\nSquare\nTriangle\nEnter type shape:");
        String typeShape = scanner.nextLine();

        if (main.isMatch(typeShape)) {
            shape = createShape(typeShape);
            shape.rotate();
            shape.playSound();
        }
    }

    private void init() {
        patterns.add(Pattern.compile("(^circle$)", Pattern.CASE_INSENSITIVE));
        patterns.add(Pattern.compile("(^square$)", Pattern.CASE_INSENSITIVE));
        patterns.add(Pattern.compile("(^triangle$)", Pattern.CASE_INSENSITIVE));
    }

    private boolean isMatch(String typeShape) {
        return patterns.parallelStream()
                .anyMatch(pattern -> pattern.matcher(typeShape).matches());
    }
}
