package People;

import java.util.Scanner;

public class WorldLeaders implements peopleInterface {
    private String leaderGuessName;
    private String[] worldLeadersName = {
            "Angela Merkel",
            "Barack Obama",
            "Xi Jinping",
            "Emmanuel Macron",
            "Vladimir Putin",
            "Narendra Modi",
            "Justin Trudeau",
            "Boris Johnson",
            "Shinzo Abe",
            "Jair Bolsonaro"
            // Add more world leader names as needed
    };

    Scanner scan = new Scanner(System.in);

    public void displayNames() {
        for (int i = 0; i < worldLeadersName.length; i++) {
            System.out.print(worldLeadersName[i] + "   ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    public void guessName() {
        boolean isGuessCorrect = false;
        while (!isGuessCorrect) {
            System.out.print("\nGuess: ");
            leaderGuessName = scan.nextLine();
            for (String name : worldLeadersName) {
                if (name.equalsIgnoreCase(leaderGuessName)) {
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
