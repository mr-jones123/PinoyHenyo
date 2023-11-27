package GameMode;
import java.util.HashMap;
public class GameModeFactory {
    private static final HashMap<Integer, GameMode> _gameModes = new HashMap<>();

    GameModeFactory() {
        _gameModes.put(1, new SinglePlayer());
        _gameModes.put(2, new MultiPlayer());
        _gameModes.put(3, new Custom());
        _gameModes.put(4, new TimeAttack());
    }

    public static GameMode getGameMode(Integer choice) {
        return _gameModes.get(choice);
    }

    public static void displayModes() {
        for (Integer key : _gameModes.keySet()) {
            System.out.println(key + ". " + _gameModes.get(key).getGameModeName());
        }
    }
}
