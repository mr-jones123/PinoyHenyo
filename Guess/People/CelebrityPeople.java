package Guess.People;
import java.util.Arrays;

import Guess.Guess;
public class CelebrityPeople extends Guess {        
    CelebrityPeople() {
        super(new String[] {
            "Tom Hanks",
            "Jennifer Lawrence",
            "Leonardo DiCaprio",
            "Beyoncé",
            "Dwayne Johnson",
            "Emma Watson",
            "Chris Hemsworth",
            "Adele",
            "Will Smith",
            "Scarlett Johansson",
            "Keanu Reeves",
            "Taylor Swift",
            "Brad Pitt",
            "Angelina Jolie",
            "Robert Downey Jr.",
            "Cristiano Ronaldo",
            "Lionel Messi",
            "Selena Gomez",
            "Kylie Jenner",
            "Drake",
            "The Weeknd"
        });
    }
  void Guess( String []CelebrityPeople){
    _guessWords.addAll(Arrays.asList(CelebrityPeople));
  }
  @Override
  protected void displaySet() {
      super.displaySet();
  }
}
