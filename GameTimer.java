import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
    private Timer timer;
    private int secondsRemaining;

    public GameTimer() {
        this.timer = new Timer();
    }

    public void start(int maxTimeInSeconds) {
        this.secondsRemaining = maxTimeInSeconds;

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                secondsRemaining--;
                if (secondsRemaining <= 0) {
                    timer.cancel();
                    // You can add code here to handle what happens when the time runs out
                }
            }
        }, 0, 1000);
    }

    public int getSecondsRemaining() {
        return secondsRemaining;
    }
}