package turbomann.kovalevsky.XO.controller;

import turbomann.kovalevsky.XO.model.Player;

public class Game {
    private static final String GAME_NAME = "XO";

    private Player [] players;

    public String getGameName(){
        return GAME_NAME;
    }
    public Player currentPlayer(){
        return null;
    }

    public boolean move(final int x, final int y){
        return false;
    }

    public Player[] getPlayers() {
        return players;
    }
}
