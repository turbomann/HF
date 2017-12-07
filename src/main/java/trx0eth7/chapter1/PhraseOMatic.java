package trx0eth7.chapter1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This program generates pieces of advice.
 * You can set n-number of arrays, for example wordsOne, wordsTwo, wordsThree.
 * Sources:
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/StringJoiner.html">StringJoiner</a>
 * @see <a href="https://www.mkyong.com/java8/java-8-stringjoiner-example/">Stringjoiner example</a>
 * @see <a href="https://habrahabr.ru/company/luxoft/blog/270383/">Java Stream API</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html">Java Collectors</a>
 */
public class PhraseOMatic {
    private static String[] wordsOne = {"побрить", "помыть", "съесть", "выпить", "увидеть", "посетить", "приголубить", "отругать", "презирать", "обозвать"};
    private static String[] wordsTwo = {"мохнатый", "красивый", "шепелявый", "прыщавый", "сладкий", "единственный и неповторимый", "страшный", "писклявый", "умный", "похотливый"};
    private static String[] wordsThree = {"ананас", "апельсин", "портфель", "кипяток", "душ", "музей"};

    public static void main(String... args) {
        PhraseOMatic phraseOMatic = new PhraseOMatic();
        String phrase = phraseOMatic.phrase(wordsOne, wordsTwo, wordsThree);
        System.out.printf("Все, что Вам нужно, - это %s", phrase);
    }


    private int random(int length) {
        return (int) (Math.random() * length);
    }

    private String concat(String... words) {
        return Arrays.stream(words).collect(Collectors.joining(" "));
    }

    private String generator(String... words) {
        return words[random(words.length)];
    }

    private String phrase(String[]... listWords) {
        String[] result = new String[listWords.length];
        for (int i = 0; i < listWords.length; ++i) {
            result[i] = generator(listWords[i]);
        }
        return concat(result);
    }
}
