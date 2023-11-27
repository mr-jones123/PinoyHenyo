package GameMode;

public abstract class GameMode {
    String _gameMode = "";

    public abstract void play();

    public void setGameMode(GameMode gameMode) {
        _gameMode = gameMode._gameMode;
    }
}