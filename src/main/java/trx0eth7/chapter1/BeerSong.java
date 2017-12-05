package trx0eth7.chapter1;

import java.util.*;
import static trx0eth7.chapter1.BeerSong.Bottle.*;

public class BeerSong {
    private List<Bottle> bottles = Arrays.asList(BOTTLE_1,BOTTLE_2, BOTTLE_3);

    public static void main(String... args) {

        int beerNumb = 99;
        BeerSong beerSong = new BeerSong();
        String word;

        while (beerNumb > 0){
            word = beerSong.getRightEnding(beerNumb);
            System.out.printf("%d %s пива на стене\n", beerNumb, word);
            System.out.printf("%d %s пива.\n", beerNumb, word);
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            --beerNumb;
            word = beerSong.getRightEnding(beerNumb);
            if(beerNumb > 0){
                System.out.printf("%d %s пива на стене\n", beerNumb, word);
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }

    enum Bottle{
        BOTTLE_1("бутылка", Collections.singletonList(1)),
        BOTTLE_2("бутылки", Arrays.asList(2,3,4)),
        BOTTLE_3("бутылок", Arrays.asList(0,5,6,7,8,9));
        private String ending;
        private List<Integer> availableNum;

        Bottle(String ending, List<Integer> availableNum) {
            this.ending = ending;
            this.availableNum = new ArrayList<>(availableNum);

        }
        public String getEnding(){
            return ending;
        }

        public List<Integer> getAvailableNum() {
            return availableNum;
        }

    }

    private String getRightEnding(int beerNumb){
        final int num = beerNumb%10;
        Optional<Bottle> getter = bottles.stream()
                .filter((bottle)-> bottle.getAvailableNum().contains(num))
                .findFirst();
        return getter.map(Bottle::getEnding).orElse("not found word");
    }


}