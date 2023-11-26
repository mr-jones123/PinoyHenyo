package Things;

import java.util.Scanner;

public class homeThings implements thingsInterface {
    private String homeThingGuess;
    private String[] homeThingsArray = {
            "Television",
            "Refrigerator",
            "Sofa",
            "Coffee Maker",
            "Lamp",
            "Computer",
            "Microwave",
            "Washing Machine",
            "Toaster",
            "Blender"

    };

    Scanner scan = new Scanner(System.in);

    public void displayStuff() {
        for (int i = 0; i < homeThingsArray.length; i++) {
            System.out.print(homeThingsArray[i] + "   ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    public void guessStuff() {
        boolean isGuessCorrect = false;
        while (!isGuessCorrect) {
            System.out.print("\nGuess: ");
            homeThingGuess = scan.nextLine();
            for (String thing : homeThingsArray) {
                if (thing.equalsIgnoreCase(homeThingGuess)) {
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
