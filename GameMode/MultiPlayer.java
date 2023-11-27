package GameMode;

import Difficulty.Difficulty;
import Players.player1;

public class MultiPlayer extends GameMode {
    public String [] guesswords = new String[0];
    Difficulty difficulty = new Difficulty();
    player1 p1 = new player1(guesswords);
    public MultiPlayer() {
        _gameModeName = "Multi Player";
    }
    int difficultyNumber = difficulty.getDifficultyLevel();
    @Override
    public void play() {
      switch (difficultyNumber) {
        case 1:
            System.out.println("Playing " + _gameModeName +  "in Easy Mode.");
            //Player 1 first,
            p1.initializGuessingWords();
            break;
        case 2:
            System.out.println("Playing " + _gameModeName + " in Medium Mode.");
            break;
        case 3:
            System.out.println("Playing " + _gameModeName + " in Hard Mode.");
            break;
        default:
            break;
      }
        
    }
}
