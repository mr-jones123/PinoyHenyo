package GameMode;

import Guess.WordBank;
import GameTimer.GameTimer;

public class SinglePlayer extends GameMode {
    public SinglePlayer() {
        _gameModeName = "Single Player";
    }

    @Override
    public void play(WordBank wb, GameTimer gameTimer) {
        System.out.print("\033[H\033[2J");
        System.out.println("Playing " + _gameModeName + "...");
        System.out.println("Category: " + wb.getCategory() + " - " + wb.getSubcategory());
        System.out.print("Guess the word: ");
        _ioSingleton.getScanner().nextLine();
        String guessWord = wb.getRandomWord();
        String input = "";
        do {
            input = _ioSingleton.getScanner().nextLine();
            if (input.equalsIgnoreCase(guessWord) ) {
                System.out.println("Correct!");
                gameTimer.stop();
                return;
            } else {
                System.out.println("Incorrect! Try again.");
            }
        } while (!input.equals(guessWord));
    }
}
