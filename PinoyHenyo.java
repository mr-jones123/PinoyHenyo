import java.util.HashSet;
import GameMode.GameMode;
import GameMode.SinglePlayer;
import GameMode.MultiPlayer;

public class PinoyHenyo {
    private HashSet<String> gameModes = new HashSet<>();
    private GameMode gameMode = null;
    IOSingleton io = IOSingleton.getInstance();
    Timer timer = new Timer();

    private void play() {
        gameMode.play();
    }

    private void promptMode() {
        Integer choice = 0;
        System.out.println("Choose game mode: ");
        gameModes.forEach((gameMode) -> {
            System.out.println(gameMode);
        });
        System.out.print("Enter choice: ");
        while (choice != 1 && choice != 2) {
            choice = io.getScanner().nextInt();
            switch (choice) {
                case 1: {
                    gameMode.setGameMode(new SinglePlayer());
                    break;
                }
                case 2: {
                    gameMode.setGameMode(new MultiPlayer());
                    break;
                }
                default: {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        }
    }



    public void start() {
        promptMode();
        play();
    }

    public PinoyHenyo() {

    }
}
