package Location;

import java.util.Scanner;

public class international implements locationInterface {
    private String internationalPlaceGuess;
    private String[] internationalPlacesArray = {
            "Paris",
            "Tokyo",
            "New York",
            "London",
            "Sydney",
            "Dubai",
            "Rome",
            "Beijing",
            "Rio de Janeiro",
            "Cairo"
        
    };

    Scanner scan = new Scanner(System.in);

    public void displayPlaces() {
        for (int i = 0; i < internationalPlacesArray.length; i++) {
            System.out.print(internationalPlacesArray[i] + "   ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    public void guessLocation() {
        boolean isGuessCorrect = false;
        while (!isGuessCorrect) {
            System.out.print("\nGuess: ");
            internationalPlaceGuess = scan.nextLine();
            for (String place : internationalPlacesArray) {
                if (place.equalsIgnoreCase(internationalPlaceGuess)) {
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
