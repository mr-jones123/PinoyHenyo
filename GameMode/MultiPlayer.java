package GameMode;

public class MultiPlayer extends GameMode {
    public MultiPlayer() {
        gameMode = "Multi Player";
    }

    @Override
    public void play() {
        System.out.println("Playing " + gameMode);
    }
}