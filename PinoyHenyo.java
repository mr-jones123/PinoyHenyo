import Difficulty.Difficulty;
import GameMode.GameMode;
import GameMode.GameModeFactory;
import Guess.WordBank;
import Guess.WordBankMap;
import IO.IOSingleton;

public class PinoyHenyo {
    private static final Members members = new Members();
    private static final IOSingleton io = IOSingleton.getInstance();
    private static final GameModeFactory gameModeFactory = new GameModeFactory();
    private static final Difficulty difficulty = new Difficulty();
    private static final WordBankMap wordBankMap = new WordBankMap();
    private Game game = null;
    private Integer difficultyLevel = 1;
    private WordBank wordBank = null;

    private Integer promptMode() {
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

    private Integer promptDifficulty() {
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

    private void promptWordBank() {
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

    public void exec() {
        Integer mode = promptMode();
        GameMode gameMode = gameModeFactory.getGameMode(mode);
        promptDifficulty();
        promptWordBank();
        game = new Game(gameMode, difficulty, wordBank);
        game.play();
        members.printMembers();
    }
}