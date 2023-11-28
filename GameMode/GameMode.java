package GameMode;

import Guess.WordBank;
import IO.IOSingleton;
import GameTimer.GameTimer;
public abstract class GameMode {
    String _gameModeName = "";
    GameMode _gm = null;
    WordBank _wb = null;
    IOSingleton _ioSingleton = IOSingleton.getInstance();


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

    public abstract void play(WordBank wb, GameTimer gameTimer);
}