package Difficulty;

import java.util.HashMap;

public class Difficulty {
    private final static HashMap<Integer, String> difficultyLevels = new HashMap<>();
    private final static HashMap<String, Integer> timeLimits = new HashMap<>();

    public Difficulty() {
        difficultyLevels.put(1, "Easy");
        difficultyLevels.put(2, "Medium");
        difficultyLevels.put(3, "Hard");

        timeLimits.put("Easy", 5 * 60);
        timeLimits.put("Medium", 3 * 60);
        timeLimits.put("Hard", 2 * 60);
    }

    public int getTimeLimit(int difficultyLevel) {
        String difficulty = difficultyLevels.get(difficultyLevel);
        return timeLimits.get(difficulty);
    }

    public void displayMap() {
        for (Integer key : difficultyLevels.keySet()) {
            System.out.println(key + ". " + difficultyLevels.get(key));
        }
    }

    public HashMap<Integer, String> getDifficultyLevels() {
        return difficultyLevels;
    }
}