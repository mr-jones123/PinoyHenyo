package Players;

import java.io.Console;
import java.util.Scanner;

import Guess.Guess;
import Guess.Location.location;
import Guess.People.people;

// The one who sets the guessing words
public class player1 extends Guess {
    Console console = System.console();
    people People = new people();
    location Location = new location();
    public player1(String[] guessWords) {
        super(guessWords);
    }

    Scanner scan = new Scanner(System.in);
    private char[] guessWord1;

    //initalizing the category
    public void initializGuessingWords() {
        System.out.println("SELECT CATEGORY:");
        System.out.println("PEOPLE |  LOCATION  | THINGS");
        guessWord1 = console.readPassword("Enter First Mystery Word: ");
        String guessWord1String = new String(guessWord1);
        if (guessWord1String.equalsIgnoreCase("People")) {
            System.out.println("First Word Initalized!");
            People.initializeforPeople(guessWord1String);
   }
    //     if (guessWord1String.equalsIgnoreCase("Location")){
    //         System.out.println("First Word Initalized!");
    //         Location.locationOperations();
    //     }
    //     if (guessWord1String.equalsIgnoreCase("Things")){
    //         System.out.println("First Person Initialized!");
            
    //     }
    // }   


    }}
