package GameMode;

public class SinglePlayer extends GameMode {
    public SinglePlayer() {
        gameMode = "Single Player";
    }

    @Override
    public void play() {
        System.out.println("Playing " + gameMode);
    }
}