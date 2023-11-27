package GameMode;

public abstract class GameMode {
    String _gameModeName = "";
    GameMode _gm = null;

    public abstract void play();

    GameMode() {
        _gameModeName = "";
    }

    public String getGameModeName() {
        return _gameModeName;
    }

    public void setGameMode(GameMode gameMode) {
        _gm = gameMode;
    }
}