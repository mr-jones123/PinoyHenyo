package Location;

import java.util.Scanner;

public class local implements locationInterface {
    private String localPlaceGuess;
    private String[] localPlacesArray = {
            "Manila",
            "Cebu",
            "Davao",
            "Quezon City",
            "Taguig",
            "Makati",
            "Cagayan de Oro",
            "Iloilo",
            "Baguio",
            "Palawan"

    };

    Scanner scan = new Scanner(System.in);

    public void displayPlaces() {
        for (int i = 0; i < localPlacesArray.length; i++) {
            System.out.print(localPlacesArray[i] + "   ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    public void guessLocation() {
        boolean isGuessCorrect = false;
        while (!isGuessCorrect) {
            System.out.print("\nGuess: ");
            localPlaceGuess = scan.nextLine();
            for (String place : localPlacesArray) {
                if (place.equalsIgnoreCase(localPlaceGuess)) {
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
