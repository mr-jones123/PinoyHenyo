package Things;

import java.util.Scanner;

public class SchoolThings implements thingsInterface {
    private String schoolThingGuess;
    private String[] schoolThingsArray = {
            "Textbook",
            "Notebook",
            "Pencil",
            "Backpack",
            "Calculator",
            "Laptop",
            "Ruler",
            "Eraser",
            "Marker",
            "Water Bottle"
    };

    Scanner scan = new Scanner(System.in);

    public void displayStuff() {
        for (int i = 0; i < schoolThingsArray.length; i++) {
            System.out.print(schoolThingsArray[i] + "   ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    public void guessStuff() {
        boolean isGuessCorrect = false;
        while (!isGuessCorrect) {
            System.out.print("\nGuess: ");
            schoolThingGuess = scan.nextLine();
            for (String thing : schoolThingsArray) {
                if (thing.equalsIgnoreCase(schoolThingGuess)) {
                    System.out.println("Congratulations! Your guess is correct.");
                    isGuessCorrect = true;
                    break;
                }
            }

            if (!isGuessCorrect) {
                System.out.println("Incorrect guess. Try again.");
            }
        }
    }
}
   

