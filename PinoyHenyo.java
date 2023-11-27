import GameMode.Custom;
import GameMode.SinglePlayer;
import IO.IOSingleton;

public class PinoyHenyo {
    private static final Members members = new Members();
    private static final IOSingleton io = IOSingleton.getInstance();
    private static final Game game = new Game();

    private void promptMode() {
        Integer choice = 0;
        System.out.println("Choose game mode: ");
        
        System.out.print("Enter choice: ");
        while (choice != 1 && choice != 2) {
            choice = io.getScanner().nextInt();
            switch (choice) {
                case 1: {
                    game.gameMode.setGameMode(new SinglePlayer());
                    break;
                }
                case 2: {
                    game.gameMode.setGameMode(new Custom());
                    break;
                }   
                default: {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        }
    }
    
    
    public void exec() {
        promptMode();
        game.difficulty.promptDifficultyLevel();
        game.play();
        members.printMembers();
    }

    public PinoyHenyo() {

    }
}
