package People;
import java.util.Scanner;
public class celebrities implements peopleInterface {
    private String celebrityGuessName;
    private String[] celebritiesName = {
            "Tom Hanks",
            "Jennifer Lawrence",
            "Leonardo DiCaprio",
            "Beyoncé",
            "Dwayne Johnson",
            "Emma Watson",
            "Chris Hemsworth",
            "Adele",
            "Will Smith",
            "Scarlett Johansson",
            "Keanu Reeves",
            "Taylor Swift",
            "Brad Pitt",
            "Angelina Jolie",
            "Robert Downey Jr.",
            "Cristiano Ronaldo",
            "Lionel Messi",
            "Selena Gomez",
            "Kylie Jenner",
            "Drake",
            "The Weeknd"
        };

    Scanner scan = new Scanner(System.in);
    public void displayNames(){
        for (int i = 0; i < celebritiesName.length; i++){
                System.out.print(celebritiesName[i] + "   ");
                if ( i % 5 == 0) {
                    System.out.println();
                }
        }
    }

    //STUDY THE LOGIC IN THIS 
    public void guessName() {
        boolean isGuessCorrect = false;
        while (!isGuessCorrect) {
            System.out.print("\nGuess: ");
            celebrityGuessName = scan.nextLine();
            for (String name : celebritiesName) {
                if (name.equalsIgnoreCase(celebrityGuessName)) {
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
