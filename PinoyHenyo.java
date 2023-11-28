import Difficulty.Difficulty;
import GameMode.GameMode;
import GameMode.GameModeFactory;
import Guess.WordBank;
import Guess.WordBankFactory;
import IO.IOSingleton;

public class PinoyHenyo {
    private static final Auxillary aux = new Auxillary();
    private static final IOSingleton io = IOSingleton.getInstance();
    private static final GameModeFactory gameModeFactory = new GameModeFactory();
    private static final Difficulty difficulty = new Difficulty();
    private static final WordBankFactory wordBankMap = new WordBankFactory();
    private static Game game = null;
    private static WordBank wordBank = null;

    private static Integer promptMode() {
        gameModeFactory.displayModes();
        do {
            System.out.print("Enter game mode: ");
            Integer choice = io.getScanner().nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice!");
                continue;
            }
            return choice;
        } while (true);
    }

    private static Integer promptDifficulty() {
        difficulty.displayMap();
        do {
            System.out.print("Enter difficulty: ");
            Integer choice = io.getScanner().nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice!");
                continue;
            }
            return choice;
        } while (true);
    }

    private static void promptWordBank() {
        wordBankMap.displayMap();
        do {
            System.out.print("Enter word bank: ");
            Integer choice = io.getScanner().nextInt();
            if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice!");
                continue;
            }
            wordBank = wordBankMap.getWordBank(choice);
            return;
        } while (true);
    }

    public static void exec() {
        aux.printIntro();
        Integer tryAgain = 0;
        do {
            Integer mode = promptMode();
            GameMode gameMode = gameModeFactory.getGameMode(mode);
            System.out.println("-----------------------");
            Integer difficultyLevel = promptDifficulty();
            System.out.println("-----------------------");
            promptWordBank();
            System.out.println("-----------------------");
            game = new Game(gameMode, wordBank);
            game.play(difficultyLevel);

        } while (tryAgain == 1);
    }
}