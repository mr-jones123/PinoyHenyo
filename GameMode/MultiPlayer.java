package GameMode;

public class MultiPlayer extends GameMode {
    public MultiPlayer() {
        _gameModeName = "Multi Player";
    }

    @Override
    public void play() {
        System.out.println("Playing " + _gameModeName);
    }
}
