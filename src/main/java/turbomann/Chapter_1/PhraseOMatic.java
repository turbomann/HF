package turbomann.Chapter_1;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "жрать", "30,000 футовый", "умный", "динамичный"};
        String[] wordListTwo = {"Трудный" ,"Достижимй", "Фирменный", "сетевой"};
        String[] wordListThree = {"талант", "зевс", "выздоровдленный", "меркантильный"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Все что нам надо это" + phrase);
    }
}
