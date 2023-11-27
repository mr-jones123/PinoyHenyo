import Difficulty.Difficulty;
import GameMode.GameModeFactory;
import GameMode.MultiPlayer;
import IO.IOSingleton;

public class PinoyHenyo {
    private static final MultiPlayer multiplayer = new MultiPlayer();
    private static final Members members = new Members();
    private static final IOSingleton io = IOSingleton.getInstance();
    private static final GameModeFactory gameModeFactory = new GameModeFactory();
    private static final Game game = new Game();
    private static final Difficulty difficulty = new Difficulty();

    private Integer promptMode() {
        gameModeFactory.displayModes();
        System.out.print("Enter game mode: ");
        Integer choice = io.getScanner().nextInt();
        return choice;
    }

    public void exec() {
        Integer mode = promptMode();
        switch (mode) {
            case 2:
                difficulty.promptDifficultyLevel();
                multiplayer.play();
                break;
        
            default:
                break;
        }
        // difficulty.promptDifficultyLevel();
        // Integer difficultyLevel = difficulty.getDifficultyLevel();
        // // game.init(gameModeFactory.getGameMode(mode), difficultyLevel);
        // members.printMembers();
    }

}
