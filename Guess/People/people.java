package Guess.People;
import Guess.Location.location;
import Guess.People.people;
import java.io.Console;

public class people {
    Console console = System.console();
    private char[] initGuessWord2, initGuessWord3;
    private char[] guessSubCategory2, finalGuessWord;
    AthletePeople athlete = new AthletePeople();
    CelebrityPeople celeb = new CelebrityPeople();
    WorldLeaderPeople world = new WorldLeaderPeople();
    // WorldLeaderPeople world = new WorldLeaderPeople();
    // //for player 2, for guessing
    // public void peopleGuess() {
    //     System.out.println("ATHLETE | CELEBRITY | WORLD LEADER");
    //     guessSubCategory2 = console.readPassword("Guess: ");
    //     String guessStringWord2 = new String(guessSubCategory2);
    //     if (athlete.exists(guessStringWord2)) {
    //         System.out.println("Splendid!");
    //         System.out.println();
    //         athlete.displaySet();
    //         System.out.println();
    //         finalGuessWord = console.readPassword("Guess: ");
    //         String finalGuessWordString = new String(finalGuessWord);
    //         if (athlete.exists(finalGuessWordString)) {
    //             System.out.println("YOU WON");
    //         }

    //     }
    //     if (celeb.exists(guessStringWord2)) {
    //         System.out.println("Splendid!");
    //         System.out.println();
    //         celeb.displaySet();
    //         finalGuessWord = console.readPassword("Guess: ");
    //         String finalGuessWordString = new String(finalGuessWord);
    //         if (celeb.exists(finalGuessWordString)) {
    //             System.out.println("YOU WON");
    //         }
    //     }
    //     if (world.exists(guessStringWord2)){
    //         System.out.println("Splendid!");
    //         System.out.println();
    //         world.displaySet();
    //         finalGuessWord = console.readPassword("Guess: ");
    //         String finalGuessWordString = new String(finalGuessWord);
    //         if (world.exists(finalGuessWordString)) {
    //             System.out.println("YOU WON");
    //         }
    //     }
    // }
    //FOR PLAYER 1
    public void initializeforPeople(String GuessWordString1){
        System.out.println("SELECT CATEGORY:");
        System.out.println("ATHLETE |  CELEBRITIES  | WORLD LEADERS");
        initGuessWord2 = console.readPassword("Enter Second Mystery Word: ");
        String GuessWordString2 = new String(initGuessWord2);
        if (GuessWordString2.equalsIgnoreCase("Athlete")){
            athlete.addGuess(GuessWordString1);// first word
            athlete.addGuess(GuessWordString2); //second word
            athlete.displaySet();
            initGuessWord3 = console.readPassword("Enter Final Mystery Word: ");
            String GuessWordString3 = new String(initGuessWord3);
            athlete.addGuess(GuessWordString3); //third word
        }
        if (GuessWordString2.equalsIgnoreCase("Celebrities")){
            celeb.addGuess(GuessWordString1); // first word
            celeb.addGuess(GuessWordString2); // second word
            initGuessWord3 = console.readPassword("Enter Final Mystery Word: ");
            String GuessWordString3 = new String(initGuessWord3);
            athlete.addGuess(GuessWordString3);
        }
        if (GuessWordString2.equalsIgnoreCase("World Leaders")){
            world.addGuess(GuessWordString1);
            world.addGuess(GuessWordString2);
            initGuessWord3 = console.readPassword("Enter Final Mystery Word: ");
            String GuessWordString3 = new String(initGuessWord3);
            athlete.addGuess(GuessWordString3);
        }
        }
    }

