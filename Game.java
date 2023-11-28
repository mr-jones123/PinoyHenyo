import GameMode.GameMode;
import GameTimer.GameTimer;
import Difficulty.Difficulty;
import Guess.WordBank;

public class Game {
    private GameMode _gameMode = null;
    private Difficulty _difficulty = null;
    private WordBank _wb = null;
    private GameTimer _gameTimer = null;

    public Game(GameMode gameMode, WordBank guess) {
        _gameMode = gameMode;
        _wb = guess;
        _difficulty = new Difficulty();
        _gameTimer = new GameTimer();
    }

    public void play(Integer difficultyLevel) {
        int timeLimit = _difficulty.getTimeLimit(difficultyLevel);
        _gameTimer.start(timeLimit);
        _gameMode.play(_wb, _gameTimer);
    }
}
