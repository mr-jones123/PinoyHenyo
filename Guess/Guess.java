package Guess;

import java.util.HashSet;
import java.util.Arrays;
public abstract class Guess {
    protected HashSet<String> _guessWords = new HashSet<String>();

    protected String _category = "" , _subcategory = "";

    public boolean exists(String guessWord) {
        return _guessWords.contains(guessWord);
    }

    protected Guess(String[] guessWords) {
        _guessWords.addAll(Arrays.asList(guessWords));
    }

    public void displaySet() {
        for (String guessWord : _guessWords) {
            System.out.println(guessWord);
        }
    }
    public void addGuess(String guessWord){
        _guessWords.add(guessWord);
    }

}
