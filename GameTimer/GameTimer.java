package GameTimer;
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
                printTimeRemaining();
                secondsRemaining--;
            }
        }, 1000, 1000);
        timer.schedule(new TimerTask() {
            public void run() {
                timer.cancel();
            }
        }, maxTimeInSeconds * 1000);
    }

    public void printTimeRemaining() {
        if (this.secondsRemaining % 30 == 0) {
            System.out.println("\n-----------------------");
            System.out.println("Time remaining: " + this.secondsRemaining + " seconds");
        }
    }

    public int getSecondsRemaining() {
        return this.secondsRemaining;
    }
}
