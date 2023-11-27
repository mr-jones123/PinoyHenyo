package Difficulty;

import java.util.HashSet;

import IO.IOSingleton;

public class Difficulty {
    private final static HashSet<String> difficultyLevels = new HashSet<>();
    IOSingleton io = IOSingleton.getInstance();

    public Difficulty() {
        difficultyLevels.add("Easy");
        difficultyLevels.add("Medium");
        difficultyLevels.add("Hard");
    }

    public static void displaySet() {
        for (String difficultyLevel : difficultyLevels) {
            System.out.println(difficultyLevel);
        }
    }

    public Integer promptDifficultyLevel() {
        Integer choice = 0;
        System.out.println("Choose difficulty: ");
        displaySet();
        System.out.print("Enter choice: ");
        while (choice != 1 && choice != 2 && choice != 3) {
            choice = IOSingleton.getInstance().getScanner().nextInt();
            switch (choice) {
                case 1: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                case 3: {
                    return 3;
                }
                default: {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        }
        return 0;
    }
}
