public class Timer {
    private long _startTime = 0;
    private long _endTime = 0;
    private boolean _isRunning = false;

    public Timer() {
    }

    public void start() {
        _startTime = System.currentTimeMillis();
        _isRunning = true;
    }

    public void stop() {
        _endTime = System.currentTimeMillis();
        _isRunning = false;
    }

    public long get_startTime() {
        return _startTime;
    }

    public long get_endTime() {
        return _endTime;
    }

    public long getElapsedTime() {
        return _endTime - _startTime;
    }

    public boolean is_isRunning() {
        return _isRunning;
    }
}