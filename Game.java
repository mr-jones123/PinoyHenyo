import Difficulty.Difficulty;
import IO.IOSingleton;
import GameMode.GameMode;
import GameMode.SinglePlayer;

public class Game {
    public GameMode gameMode = new SinglePlayer();
    private static final Timer timer = new Timer();
    private static final IOSingleton io = IOSingleton.getInstance();
    public final Difficulty difficulty = new Difficulty();

    


    public void play() {
        gameMode.play();
    }
}
