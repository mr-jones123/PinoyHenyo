package GameMode;

public class SinglePlayer extends GameMode {
    public SinglePlayer() {
        _gameMode = "Single Player";
    }

    @Override
    public void play() {
        System.out.println("Playing " + _gameMode);
    }
}