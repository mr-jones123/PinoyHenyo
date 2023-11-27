package Guess.Location;

import java.io.Console;

public class location {
    Console console = System.console();
    private char[] guessSubCategory2, finalGuessWord;
    IntlLocation international = new IntlLocation();
    LocalLocation local = new LocalLocation();

    public void locationOperations() {
        System.out.println("INTERNATIONAL | LOCAL ");
        guessSubCategory2 = console.readPassword("Guess: ");
        String guessStringWord2 = new String(guessSubCategory2);
        if (international.exists(guessStringWord2)) {
            System.out.println("Splendid!");
            System.out.println();
            international.displaySet();
            System.out.println();
            finalGuessWord = console.readPassword("Guess: ");
            String finalGuessWordString = new String(finalGuessWord);
            if (international.exists(finalGuessWordString)) {
                System.out.println("YOU WON");
            }

        }
         if (local.exists(guessStringWord2)) {
            System.out.println("Splendid!");
            System.out.println();
            local.displaySet();
            System.out.println();
            finalGuessWord = console.readPassword("Guess: ");
            String finalGuessWordString = new String(finalGuessWord);
            if (local.exists(finalGuessWordString)) {
                System.out.println("YOU WON");
            }

        }

    }
}