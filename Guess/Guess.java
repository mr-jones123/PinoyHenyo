package Guess;

import java.util.HashSet;
import java.util.Arrays;
// NOTE: Tier 1: People Location Things
// Tier 2: The categories below it, e.g celebrities in people
public abstract class Guess {
    protected HashSet<String> _guessWords = new HashSet<String>();

    protected boolean exists(String guessWord) {
        return _guessWords.contains(guessWord);
    }

    protected Guess(String[] guessWords) {
        _guessWords.addAll(Arrays.asList(guessWords));
    }

    protected void displaySet() {
        for (String guessWord : _guessWords) {
            System.out.println(guessWord);
        }
    }
    protected String getTier1(String guesstier1){
        return guesstier1;
    }
    protected String getTier2(String guesstier2){
        return guesstier2;
    }
    //TTHE FINAL GUESS
    protected String getTier3(String guesstier3){
        return guesstier3;
    }
    
}
