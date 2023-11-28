package Guess;

import java.util.TreeMap;
import Guess.Location.*;
import Guess.People.*;
import Guess.Things.*;

public class WordBankMap {
    
    private final static TreeMap<Integer, WordBank> wordBankMap = new TreeMap<>();
    
    public WordBankMap() {
        wordBankMap.put(1, new IntlLocation());
        wordBankMap.put(2, new LocalLocation());
        wordBankMap.put(3, new AthletePeople());
        wordBankMap.put(4, new CelebrityPeople());
        wordBankMap.put(5, new WorldLeaderPeople());
        wordBankMap.put(6, new HomeThings());
        wordBankMap.put(7, new SchoolThings());
    }

    public TreeMap<Integer, WordBank> getWordBankMap() {
        return wordBankMap;
    }

    public void displayMap() {
        for (Integer key : wordBankMap.keySet()) {
            System.out.println(key + ". " + wordBankMap.get(key).getCategory() + " - " + wordBankMap.get(key).getSubcategory());
        }
    }

    public WordBank getWordBank(Integer key) {
        return wordBankMap.get(key);
    }
}
