package GameMode;

public abstract class GameMode {
    String gameMode = "";

    public abstract void play();

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode.gameMode;
    }
}