package Difficulty;

import java.util.HashMap;

import IO.IOSingleton;

public class Difficulty {
    private final static HashMap<Integer, String> difficultyLevels = new HashMap<>();
    private static final IOSingleton io = IOSingleton.getInstance();
    private Integer difficultyLevel = 1;

    public Difficulty() {
        difficultyLevels.put(1, "Easy");
        difficultyLevels.put(2, "Medium");
        difficultyLevels.put(3, "Hard");
    }

    public void displayMap() {
        for (Integer key : difficultyLevels.keySet()) {
            System.out.println(key + ". " + difficultyLevels.get(key));
        }
    }

    public void promptDifficultyLevel() {
        displayMap();
        System.out.print("Enter difficulty level: ");
        Integer choice = io.getScanner().nextInt();
        setDifficultyLevel(choice);
    }

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
