import GameMode.GameMode;
import Difficulty.Difficulty;
import Guess.WordBank;

public class Game {
    private GameMode gameMode = null;
    private Difficulty difficulty = null;
    private WordBank wb = null;
    private GameTimer gameTimer = null;

    public Game(GameMode gameMode, Difficulty difficulty, WordBank guess) {
        this.gameMode = gameMode;
        this.difficulty = difficulty;
        this.wb = guess;
        this.gameTimer = new GameTimer();
    }

    public void play() {
        // int timeLimit = difficulty.getTimeLimit();
        // gameTimer.start(timeLimit);
        gameMode.play();
    }
}