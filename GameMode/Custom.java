package GameMode;

public class Custom extends GameMode {
    public Custom() {
        _gameModeName = "Custom";
    }

    @Override
    public void play() {
        System.out.println("Playing " + _gameModeName);
    }
}