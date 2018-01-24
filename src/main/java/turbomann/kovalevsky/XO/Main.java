package turbomann.kovalevsky.XO;

import turbomann.kovalevsky.XO.controller.Game;
import turbomann.kovalevsky.XO.view.AdvConsoleView;
import turbomann.kovalevsky.XO.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        final Game game = new Game();

        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
        final ConsoleView ConsoleView = new ConsoleView(game);
        startGame(advConsoleView);
    }
    private static void startGame(final AdvConsoleView advConsoleView){
        advConsoleView.showGameName();
    }
}
