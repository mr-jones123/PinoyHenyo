// package Players;

// import java.util.Scanner;

// import Guess.Guess;

// // The one who sets the guessing words
// public class player1 extends Guess {
//     protected player1(String[] guessWords) {
//         super(guessWords);
//     }

//     Scanner scan = new Scanner(System.in);
//     private String chTier1, chTier2;

//     // initalizing the category
// public void initializeCategory() {
//     System.out.println("Pick Category: ");
//     System.out.println("People  Location  Things");
//     System.out.print("");
//     chTier1 = scan.nextLine(); // Must restore 

//     switch (chTier1.toLowerCase()) {
//         case "people":
//             getTier1(chTier1);
//             System.out.println("Pick another category: ");
//             System.out.println("Celebrities  Athlete  World Leaders");
//             System.out.print("");
//             chTier2 = scan.nextLine();
//             getTier2(chTier2);
//             break;

//         case "location":
//             // Handle Location category
//             break;

//         case "things":
//             // Handle Things category
//             break;

//         default:
//             System.out.println("Invalid category");
//             break;
//     }
// }
// }
