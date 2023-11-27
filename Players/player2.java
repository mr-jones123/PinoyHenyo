// package Players;

// import java.util.Scanner;
// import Guess.Guess;
// import Guess.People.CelebrityPeople;

// public class player2 extends Guess {
//     private CelebrityPeople celebrityPeople = new CelebrityPeople();
//     private player1 player1 = new player1(null);
//     private String guessWordTier1, guessWordTier3;
//     private Scanner scan = new Scanner(System.in);

//     protected player2(String[] guessWords) {
//         super(guessWords);
//     }

//     // the one who guesses
//     public void guessingOperation() {
//         System.out.println("Guess the Category: ");
//         System.out.println("PEOPLE   THINGS     LOCATION");
//         System.out.print("");
//         guessWordTier1 = scan.nextLine();
//         if (guessWordTier1.equalsIgnoreCase(player1.guessTier1)) {
//             System.out.println("CORRECT! Proceeding....");
//             guessTier("ATHLETES  CELEBRITIES  WORLD LEADERS", player1.guessTier2, "Guess the Category: ");
//         }
//     }

//     private void guessTier(String options, String correctGuess, String prompt) {
//         System.out.println(prompt);
//         System.out.println(options);
//         String guess = scan.nextLine();
//         if (guess.equalsIgnoreCase(correctGuess)) {
//             System.out.println("CORRECT! Proceeding.....");
//             guessTier3();
//         }
//     }

//     private void guessTier3() {
//         celebrityPeople.displaySet();
//         System.out.println("FINALLY, Guess the Person: ");
//         guessWordTier3 = scan.nextLine();
//         if (guessWordTier3.equalsIgnoreCase(player1.guessTier3)) {
//             System.out.println("CORRECT! YOU WON");
//         }
//     }
 
//     public void closeScanner() {
//         scan.close();
//     }
// }
