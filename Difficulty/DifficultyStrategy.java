package Difficulty;
import java.util.Random;
import java.util.HashSet;

public class DifficultyStrategy {
    private static volatile DifficultyStrategy instance = null;
    private final static Random random = new Random();
    private final static HashSet<String> difficultyLevels = new HashSet<>();

    private DifficultyStrategy() {
        difficultyLevels.add("Easy");
        difficultyLevels.add("Medium");
        difficultyLevels.add("Hard");
    }

    public static DifficultyStrategy getInstance() {
        DifficultyStrategy result = instance;
        if (instance == null) {
            synchronized (DifficultyStrategy.class) {
                result = instance;
                if (instance == null) {
                    instance = result = new DifficultyStrategy();
                }
            }
        }
        return instance;
    }

    public String getDifficultyLevel() {
        int randomIndex = random.nextInt(difficultyLevels.size());
        int i = 0;
        for (String difficultyLevel : difficultyLevels) {
            if (i == randomIndex) {
                return difficultyLevel;
            }
            i++;
        }
        return null;
    }
}
