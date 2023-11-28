package GameMode;
import java.util.HashMap;
public class GameModeFactory {
    private static final HashMap<Integer, GameMode> _gameModes = new HashMap<>();

    public GameModeFactory() {
        _gameModes.put(1, new SinglePlayer());
        _gameModes.put(2, new TimeAttack());
    }

    public GameMode getGameMode(Integer choice) {
        return _gameModes.get(choice);
    }

    public void displayModes() {
        for (Integer key : _gameModes.keySet()) {
            System.out.println(key + ". " + _gameModes.get(key).getGameModeName());
        }
    }
}
