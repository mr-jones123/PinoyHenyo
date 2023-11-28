package GameMode;

import Guess.WordBank;

public abstract class GameMode {
    String _gameModeName = "";
    GameMode _gm = null;
    WordBank _wb = null;


    // Add a constructor that accepts a Difficulty object
    public GameMode() {
        _gameModeName = "";
    }

    public String getGameModeName() {
        return _gameModeName;
    }

    public void setGameMode(GameMode gameMode) {
        _gm = gameMode;
    }

    public abstract void play(WordBank wb);
}