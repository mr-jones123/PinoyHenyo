package Guess;

import java.util.HashSet;
import java.util.Arrays;

public abstract class Guess {
    protected HashSet<String> guessWords = new HashSet<String>();

    protected boolean exists(String guessWord) {
        return guessWords.contains(guessWord);
    }

    protected Guess(String[] guessWords) {
        this.guessWords.addAll(Arrays.asList(guessWords));
    }

    protected void displaySet() {
        for (String guessWord : guessWords) {
            System.out.println(guessWord);
        }
    }
}
