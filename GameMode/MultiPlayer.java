package GameMode;

import Guess.WordBank;
public class MultiPlayer extends GameMode {
    public MultiPlayer() {
        _gameModeName = "Multi Player";
    }

    @Override
    public void play(WordBank wb) {
        System.out.println("Playing " + _gameModeName);
        
    }
}
