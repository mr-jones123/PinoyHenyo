package GameMode;

public class MultiPlayer extends GameMode {
    public MultiPlayer() {
        _gameMode = "Multi Player";
    }

    @Override
    public void play() {
        System.out.println("Playing " + _gameMode);
    }
}