package GameMode;

public class SinglePlayer extends GameMode {
    public SinglePlayer() {
        _gameModeName = "Single Player";
    }

    @Override
    public void play() {
        System.out.println("Playing " + _gameModeName);
    }
}