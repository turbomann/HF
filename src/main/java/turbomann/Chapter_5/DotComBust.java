/*package turbomann.Chapter_5;

import java.util.ArrayList;

public class DotComBust {

    //переменные которые нам понадобятся

    private GameHelper helper = new GameHelper();
    private int numOfGuesses = 0;
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();

    private void setUpGame() {

        //создали три объекта DotCom и поместили их в ArrayList
        DotCom site1 = new DotCom();
        site1.name = "YAHOO";
        DotCom site2 = new DotCom();
        site2.name = "GUBER";
        DotCom site3 = new DotCom();
        site3.name = "SMTH";
        dotComList.add(site1);
        dotComList.add(site2);
        dotComList.add(site3);

        //краткие иструкции для пользователя
        System.out.println("Create 3 sites " + site1.name + " " + site2.name + " " + site3.name);
        System.out.println("You should shoot them all");


        for (DotCom dotComToset : dotComList) { //повторяем с каждым объектом DotCom в списке
            ArrayList<String> newLocation = helper.placeDotCom(3); //запрашиваем у вспомогательного объекта адрес Сайта
            dotComToset.setLocationCells(newLocation); // вызывает сеттер из объекта DotCom что бы передать ему местоположение которое он получил ои вспомогательного метода

        }

    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) { //до тех пор пока список объектов не станет пустым
            String userGuess = helper.getUserGInput("Take a XOD"); // получаем пользовательский ввод
            checkUserGuesses(userGuess);//вызываем метод checkUserGuesses
        }
        finishGame(); //заканчиваем игру
    }

    private void checkUserGuesses(String userGuess) {
        numOfGuesses++; //инкрементируем число попыток которое сделал пользователь
        String result = "missed"; //подразумеваем промах, пока не выявили обратного
        for (DotCom dotComToTest : dotComList) { //повторяем для всех объектов DotCom в списке
            result = dotComToTest.checkYourself(userGuess); //просим DotCom проверить ход пользователя (попал / потопил)
            if (result.equals("GOTIT")) {
                break; // выбираемся из цикла, нет времени проверять другие сайты
            }
            if (result.equals("POTOPIL")) {
                dotComList.remove(dotComToTest); // сайт потоплен, его удаляем из массива и выходим из цикла
                break;
            }

        }
        System.out.println(result); //выводим результат для пользователя

    }

    void finishGame() {
        //выводим сообщение о том как пользователь прошел игру
        System.out.println("ALL site of the bottom");
        System.out.println("User" + "" + "spend" + numOfGuesses);
        if (numOfGuesses <= 15) {
            System.out.println("You're lucker")
        } else {
            System.out.println("You sucks");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust(); //создаем игровой объект
        game.setUpGame();// говорим игровому объекту подготовить игру
        game.StartPlaying(); // говорим игровому объекту начать игровой цикл (продолжаем запрашивать пользовательский воод и запрашивать результаты)
    }

}
*/
