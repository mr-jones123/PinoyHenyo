package GameMode;

import Guess.WordBank;
import GameTimer.GameTimer;

public class TimeAttack extends GameMode {
   public TimeAttack() {
       _gameModeName = "Time Attack";
   }

   @Override
   public void play(WordBank wb, GameTimer gameTimer) {
       System.out.println("Playing " + _gameModeName + "...");
       System.out.println("Category: " + wb.getCategory() + " - " + wb.getSubcategory());
       System.out.println("Guess the word: ");
       String guessWord = wb.getRandomWord();
       String input;
       int score = 0;
       do {
           input = _ioSingleton.getScanner().nextLine();
           if (input.equals(guessWord)) {
               System.out.println("Correct! Score: " + (++score));
               guessWord = wb.getRandomWord();
           } else {
               System.out.println("Incorrect!");
           }
       } while (gameTimer.getSecondsRemaining() > 0);
       System.out.println("Time's up! Your final score is: " + score);
   }
}
