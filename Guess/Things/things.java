package Guess.Things;

import java.io.Console;

public class things {
    Console console = System.console();
    private char[] guessSubCategory2, finalGuessWord;
    HomeThings home = new HomeThings();
    SchoolThings school = new SchoolThings();

    public void locationOperations() {
        System.out.println("INTERNATIONAL | LOCAL ");
        guessSubCategory2 = console.readPassword("Guess: ");
        String guessStringWord2 = new String(guessSubCategory2);
        if (home.exists(guessStringWord2)) {
            System.out.println("Splendid!");
            home.displaySet();
            System.out.println();
            finalGuessWord = console.readPassword("Guess: ");
            String finalGuessWordString = new String(finalGuessWord);
            if (home.exists(finalGuessWordString)) {
                System.out.println("YOU WON");
            }

        }
         if (school.exists(guessStringWord2)) {
            System.out.println("Splendid!");
            System.out.println();
            school.displaySet();
            System.out.println();
            finalGuessWord = console.readPassword("Guess: ");
            String finalGuessWordString = new String(finalGuessWord);
            if (school.exists(finalGuessWordString)) {
                System.out.println("YOU WON");
            }

        }

    }
}