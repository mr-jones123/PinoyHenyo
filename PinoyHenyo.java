import Difficulty.Difficulty;
import GameMode.GameModeFactory;
import IO.IOSingleton;

public class PinoyHenyo {
    private static final Members members = new Members();
    private static final IOSingleton io = IOSingleton.getInstance();
    private static final GameModeFactory gameModeFactory = new GameModeFactory();
    private static final Game game = new Game();
    private static final Difficulty difficulty = new Difficulty();

    private Integer promptMode() {
        GameModeFactory.displayModes();
        System.out.print("Enter game mode: ");
        Integer choice = io.getScanner().nextInt();
        return choice;
    }

    public void exec() {
        Integer mode = promptMode();
        difficulty.promptDifficultyLevel();
        Integer difficultyLevel = difficulty.getDifficultyLevel();
        game.init(gameModeFactory.getGameMode(mode), difficultyLevel);
        members.printMembers();
    }

    public PinoyHenyo() {

    }
}
