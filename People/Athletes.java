package People;

import java.util.Scanner;

public class Athletes implements peopleInterface {
    private String athleteGuessName;
    private String[] athletesName = {
            "Usain Bolt",
            "Serena Williams",
            "Michael Jordan",
            "Cristiano Ronaldo",
            "Lionel Messi", 
            "Simone Biles",
            "LeBron James",
            "Kobe Bryant",
            "Tom Brady",
            "Roger Federer"
            // Add more athlete names as needed
    };

    Scanner scan = new Scanner(System.in);

    public void displayNames() {
        for (int i = 0; i < athletesName.length; i++) {
            System.out.print(athletesName[i] + "   ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    public void guessName() {
        boolean isGuessCorrect = false;
        while (!isGuessCorrect) {
            System.out.print("\nGuess: ");
            athleteGuessName = scan.nextLine();
            for (String name : athletesName) {
                if (name.equalsIgnoreCase(athleteGuessName)) {
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
