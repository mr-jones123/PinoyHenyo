package Guess;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Random;

// NOTE: Tier 1: People Location Things
// Tier 2: The categories below it, e.g celebrities in people
public abstract class WordBank {
    protected HashSet<String> _guessWords = new HashSet<String>();
    protected String _category = "", _subcategory = "";

    protected boolean exists(String guessWord) {
        return _guessWords.contains(guessWord);
    }

    protected WordBank(String category, String subcategory, String[] guessWords) {
        _category = category;
        _subcategory = subcategory;
        _guessWords.addAll(Arrays.asList(guessWords));
    }

    public void displaySet() {
        for (String guessWord : _guessWords) {
            System.out.println(guessWord);
        }
    }

    public String getCategory() {
        return _category;
    }

    public String getSubcategory() {
        return _subcategory;
    }

    public String getRandomWord() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(_guessWords.size());
        int currentIndex = 0;
        for (String guessWord : _guessWords) {
            if (currentIndex == randomIndex) {
                return guessWord;
            }
            ++currentIndex;
        }
        return null;
    }
}
