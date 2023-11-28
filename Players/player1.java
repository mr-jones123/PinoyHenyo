package Players;

import java.util.Scanner;
import Guess.Guess;
import Guess.People.CelebrityPeople;

// The one who sets the guessing words
public class player1 extends Guess {
    public static String guessTier1, guessTier2, guessTier3;
    CelebrityPeople celeb = new CelebrityPeople();

    protected player1(String[] guessWords) {
        super(guessWords);
    }

    Scanner scan = new Scanner(System.in);
    private String categoryChoice, subcategoryChoice, finalChoice;

    // initializing the category
    public void initializeCategory() {
        System.out.println("Pick Category: ");
        System.out.println("People  Location  Things");
        System.out.print("");
        categoryChoice = scan.nextLine(); // Must restore

        switch (categoryChoice.toLowerCase()) {
            case "people":
                guessTier1 = categoryChoice;
                setSubcategoryAndFinalChoice("Celebrities  Athlete  World Leaders", "person");
                break;

            case "location":
                getTier1(categoryChoice);
                setSubcategoryAndFinalChoice("Local  International", "location");
                break;

            case "things":
                getTier1(categoryChoice);
                setSubcategoryAndFinalChoice("Home   School", "thing");
                break;

            default:
                System.out.println("Invalid category");
                break;
        }
    }

    private void setSubcategoryAndFinalChoice(String subcategories, String type) {
        System.out.println("Pick another category: ");
        System.out.println(subcategories);
        System.out.print("");
        subcategoryChoice = scan.nextLine();
        guessTier2 = subcategoryChoice;
        celeb.displaySet();
        System.out.println("Finally, pick a " + type + ": ");
        System.out.print("");
        finalChoice = scan.nextLine();
        guessTier3 = finalChoice;
    }
}
